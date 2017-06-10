package dataservice.rest;



import org.springframework.web.bind.annotation.RequestMapping;

import dataservice.rest.model.RestResponseContainer;

@org.springframework.web.bind.annotation.RestController

public class RestController {

    @RequestMapping(value = "/api/ib/status")
    public RestResponseContainer status() {

        final RestResponseContainer restResponseContainer = RestResponseContainer
                .builder()
                .detail("ok")
                .status("success").build();
        return restResponseContainer;
    }

}
