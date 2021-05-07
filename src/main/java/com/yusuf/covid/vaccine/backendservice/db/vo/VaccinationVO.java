package com.yusuf.covid.vaccine.backendservice.db.vo;

import com.yusuf.covid.vaccine.backendservice.common.vo.BaseVO;
import com.yusuf.covid.vaccine.backendservice.enums.VaccineType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class VaccinationVO extends BaseVO {

    private Long staffUserId;
    private VaccineType vaccineType;
    private Date firstDose;
    private Date secondDose;

}
