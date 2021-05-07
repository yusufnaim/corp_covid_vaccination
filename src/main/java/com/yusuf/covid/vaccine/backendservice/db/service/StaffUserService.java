package com.yusuf.covid.vaccine.backendservice.db.service;

import com.yusuf.covid.vaccine.backendservice.db.vo.StaffUserVO;
import org.springframework.web.client.HttpServerErrorException;

public interface StaffUserService {

    StaffUserVO retrieveFullStaffInformation(String nric) throws HttpServerErrorException;

}
