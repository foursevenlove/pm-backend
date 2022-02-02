package com.foursevenlove.pm.controller;

import com.foursevenlove.pm.IService.IPoliticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PoliticController {
    @Autowired
    private IPoliticService politicService;

    @GetMapping("/politic")
    @ResponseBody
    public Map<String, Object> getPolitic(){
        return  politicService.getPolitic();
    }
}
