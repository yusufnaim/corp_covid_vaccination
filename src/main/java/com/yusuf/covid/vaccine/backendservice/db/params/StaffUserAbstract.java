package com.yusuf.covid.vaccine.backendservice.db.params;

import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpServerErrorException;

import java.util.HashMap;
import java.util.Map;

public abstract class StaffUserAbstract {

    private static final String NRIC = "nric";

    protected Map<String, Object> createParamsForFullStaffInfoViaNric(final String nric) throws HttpServerErrorException {
        if (StringUtils.isEmpty(nric))
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "nric is required");
        Map<String, Object> params = new HashMap<>();
        params.put(NRIC, nric);
        return params;
    }

}
