package com.yusuf.covid.vaccine.backendservice.controller.impl;

import com.yusuf.covid.vaccine.backendservice.controller.VaccineController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VaccineControllerImpl implements VaccineController {

    @Override
    public ResponseEntity<List<String>> retrieveVaccinesList() {
        return null;
    }

}
