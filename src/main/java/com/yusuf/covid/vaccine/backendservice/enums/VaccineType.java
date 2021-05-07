package com.yusuf.covid.vaccine.backendservice.enums;

public enum VaccineType {

    ASTRA_ZENECA("Astra Zeneca"),
    PFIZER("Pfizer");

    private final String value;

    VaccineType(String value) {
        this.value = value;
    }

}