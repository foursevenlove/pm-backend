package com.foursevenlove.pm.controller;

import com.foursevenlove.pm.IService.INationService;
import com.foursevenlove.pm.IService.IPoliticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class NationController {
    @Autowired
    private INationService nationService;

    @GetMapping("/nation")
    @ResponseBody
    public Map<String, Object> getNation(){
        return  nationService.getNation();
    }
}
