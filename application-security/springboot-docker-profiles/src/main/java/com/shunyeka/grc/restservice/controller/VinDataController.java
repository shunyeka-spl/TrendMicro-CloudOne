package com.shunyeka.grc.restservice.controller;

import com.shunyeka.grc.restservice.models.VinMetadata;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grc/demo")
public class VinDataController {

    @GetMapping(value = "/vinData")
    public VinMetadata getVinMetadata() {
        return new VinMetadata("vin123","EV");
    }
}
