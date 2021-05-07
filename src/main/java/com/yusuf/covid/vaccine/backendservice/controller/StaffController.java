package com.yusuf.covid.vaccine.backendservice.controller;

import com.yusuf.covid.vaccine.backendservice.controller.model.response.StaffResponseModel;
import com.yusuf.covid.vaccine.backendservice.db.vo.StaffUserVO;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(value = "StaffController")
@RequestMapping(value = "/v1/staff")
public interface StaffController {

    @ApiOperation(
            value = "Retrieve Staff Information",
            nickname = "retrieveStaffInformation",
            notes = "This API handles the retrieval of staff information",
            response = StaffResponseModel.class
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Record found", response = StaffResponseModel.class),
            @ApiResponse(code = 400, message = "Unable to handle request"),
            @ApiResponse(code = 404, message = "No record found"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @GetMapping("/{nric}")
    ResponseEntity<StaffUserVO> retrieveStaffInformation(
            @ApiParam(value = "Identifier of the staff user nric", required = true)
            @PathVariable(value = "nric", required = true) final String nric);

}
