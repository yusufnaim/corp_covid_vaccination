package com.yusuf.covid.vaccine.backendservice.controller.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yusuf.covid.vaccine.backendservice.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@JsonInclude
@EqualsAndHashCode(callSuper = false)
public class StaffResponseModel extends BaseModel {

    @JsonProperty("name")
    private String name;

    @JsonProperty("staffId")
    private String staffId;

    @JsonProperty("department")
    private String department;

    @JsonProperty("level")
    private String level;

    @JsonProperty("businessGroup")
    private String businessGroup;

    public StaffResponseModel(String errorMessage){
        this.setErrorMessage(errorMessage);
    }

}