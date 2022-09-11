package com.openshift.evg.roadshow.parks.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Healthz endpoint for liveness and readiness of the application
 *
 * Created by Sandro Colli on 11/09/2022.
 */
@RestController
@RequestMapping("/ws/colli")
public class Colli {

    @RequestMapping(method = RequestMethod.GET)
    public String colli() {
        return "Sandro Fernandes Colli da Silva";
    }
}
