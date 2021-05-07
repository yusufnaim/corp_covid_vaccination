package com.yusuf.covid.vaccine.backendservice.controller;

import com.yusuf.covid.vaccine.backendservice.controller.model.response.StaffResponseModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api(value = "VaccineController")
@RequestMapping("/v1/vaccine")
public interface VaccineController {

    @ApiOperation(
            value = "Retrieve Vaccines List",
            nickname = "retrieveVaccinesList",
            notes = "This API handles the retrieval of vaccines list",
            response = StaffResponseModel.class
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Vaccines list available", response = StaffResponseModel.class),
            @ApiResponse(code = 400, message = "Unable to handle request"),
            @ApiResponse(code = 404, message = "No vaccines found"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @GetMapping
    ResponseEntity<List<String>> retrieveVaccinesList();

}
