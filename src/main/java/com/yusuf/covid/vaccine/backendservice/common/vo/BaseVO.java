package com.yusuf.covid.vaccine.backendservice.common.vo;

import com.yusuf.covid.vaccine.backendservice.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class BaseVO extends BaseModel {

    @Setter
    @Getter
    private Long uuid;

    @Setter
    @Getter
    private Date createdDt;

    @Setter
    @Getter
    private Date updatedDt;

}