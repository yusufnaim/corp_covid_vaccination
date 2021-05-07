package com.yusuf.covid.vaccine.backendservice.controller.impl;

import com.yusuf.covid.vaccine.backendservice.controller.StaffController;
import com.yusuf.covid.vaccine.backendservice.db.service.StaffUserService;
import com.yusuf.covid.vaccine.backendservice.db.vo.StaffUserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

@RestController
public class StaffControllerImpl implements StaffController {

    private static final Logger logger = LoggerFactory.getLogger(StaffControllerImpl.class);

    private final StaffUserService staffUserService;

    public StaffControllerImpl(StaffUserService staffUserService){
        this.staffUserService = staffUserService;
    }

    @Override
    public ResponseEntity<StaffUserVO> retrieveStaffInformation(String nric) {
        try {
            return new ResponseEntity<>(staffUserService.retrieveFullStaffInformation(nric), HttpStatus.OK);
        } catch (HttpServerErrorException httpServerErrorException){
            logger.error("retrieveStaffInformation hits httpServerErrorException, ", httpServerErrorException);
            return new ResponseEntity<>(
                    new StaffUserVO(httpServerErrorException.getMessage()),
                    httpServerErrorException.getStatusCode()
            );
        } catch (Exception exception){
            logger.error("retrieveStaffInformation hits exception, ", exception);
            return new ResponseEntity<>(
                    new StaffUserVO(exception.getMessage()),
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }

}
