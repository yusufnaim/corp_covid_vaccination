package com.yusuf.covid.vaccine.backendservice.db.mapper;

import com.yusuf.covid.vaccine.backendservice.db.vo.StaffUserVO;
import org.apache.ibatis.exceptions.PersistenceException;
import org.mapstruct.Mapper;

import java.util.Map;

@Mapper
public interface StaffUserMapper {

    StaffUserVO selectOneFullInformation(Map<String, Object> params) throws PersistenceException;

}