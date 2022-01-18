package com.foursevenlove.pm.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foursevenlove.pm.IService.IBasicEmpService;
import com.foursevenlove.pm.response.BasicEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class BasicEmpController {
    @Autowired
    private IBasicEmpService basicEmpService;

    @GetMapping("/basicemp")
    public Map<String, Object> getAll(@RequestParam(name = "pageIndex", defaultValue = "1", required = false) Integer currentPage,
                                      @RequestParam(name = "pageSize", defaultValue = "10", required = false) Integer pageSize,
                                      @RequestParam(name = "searchContent", required = false) String searchContent) {
        return basicEmpService.getEmp(new Page<>(currentPage, pageSize),searchContent);
    }

    @PostMapping("/basicemp")
    public int updata(@RequestBody BasicEmp updateEmp) {
        return basicEmpService.update(updateEmp);
    }

}
