package com.foursevenlove.pm.controller;

import com.foursevenlove.pm.IService.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PositionController {
    @Autowired
    private IPositionService positionService;

    @GetMapping("/position")
    public Map<String, Object> getPosition(){
        return positionService.getPosition();
    }
}
