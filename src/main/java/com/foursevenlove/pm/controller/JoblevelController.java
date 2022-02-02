package com.foursevenlove.pm.controller;

import com.foursevenlove.pm.IService.IJoblevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class JoblevelController {
    @Autowired
    private IJoblevelService joblevelService;

    @GetMapping("/joblevel")
    public Map<String, Object> getJoblevel(){
        return joblevelService.getJoblevel();
    }
}
