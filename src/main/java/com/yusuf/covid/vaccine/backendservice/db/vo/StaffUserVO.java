package com.yusuf.covid.vaccine.backendservice.db.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yusuf.covid.vaccine.backendservice.common.vo.BaseVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.Objects;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StaffUserVO extends BaseVO {

    private String name;
    private String nric;
    private String staffId;
    private Long idPosLevel;
    private Long idDepartment;

    //join
    private String posLevelName;
    private String departmentName;
    private String businessGroupName;
    private String vaccineName;
    private Date vaccineFirstDose;
    private Date vaccineSecondDose;

    //flagging
    @JsonProperty("isDoseUpdated")
    private boolean doseUpdated;

    public StaffUserVO(){};

    public StaffUserVO(String errorMessage){
       this.setErrorMessage(errorMessage);
    }

    public boolean getDoseUpdated(){
        if (Objects.isNull(vaccineFirstDose) ||
                Objects.isNull(vaccineSecondDose)){
            return false;
        } else {
            return true;
        }
    }

}