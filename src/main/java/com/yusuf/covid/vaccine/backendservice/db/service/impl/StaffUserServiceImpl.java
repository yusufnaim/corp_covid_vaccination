package com.yusuf.covid.vaccine.backendservice.db.service.impl;

import com.yusuf.covid.vaccine.backendservice.db.mapper.StaffUserMapper;
import com.yusuf.covid.vaccine.backendservice.db.params.StaffUserAbstract;
import com.yusuf.covid.vaccine.backendservice.db.service.StaffUserService;
import com.yusuf.covid.vaccine.backendservice.db.vo.StaffUserVO;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.HttpServerErrorException;

import java.util.Map;
import java.util.Objects;

@Service("staffUserService")
public class StaffUserServiceImpl extends StaffUserAbstract implements StaffUserService {

    private final StaffUserMapper staffUserMapper;

    public StaffUserServiceImpl(StaffUserMapper staffUserMapper){
        this.staffUserMapper = staffUserMapper;
    }

    @Override
    public StaffUserVO retrieveFullStaffInformation(String nric) throws HttpServerErrorException {
        try {
            return this.selectOneFullInformation(this.createParamsForFullStaffInfoViaNric(nric));
        } catch (NotFoundException notFoundException){
            throw new HttpServerErrorException(HttpStatus.NOT_FOUND, String.format("No record found for NRIC %s", nric));
        }
    }

    private StaffUserVO selectOneFullInformation(Map<String, Object> params) throws NotFoundException {
        if (CollectionUtils.isEmpty(params))
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "params is required");
        StaffUserVO staffUserVO = staffUserMapper.selectOneFullInformation(params);
        if (Objects.isNull(staffUserVO))
            throw new NotFoundException(String.format("no record found for params %s", params.toString()));
        return staffUserVO;
    }

}
