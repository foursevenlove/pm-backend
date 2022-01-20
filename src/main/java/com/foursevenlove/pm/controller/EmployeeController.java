package com.foursevenlove.pm.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foursevenlove.pm.IService.IEmployeeService;
import com.foursevenlove.pm.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class EmployeeController {
    @Autowired
    private IEmployeeService EmpService;

    @GetMapping("/emp")
    public Map<String, Object> getAll(@RequestParam(name = "pageIndex", defaultValue = "1", required = false) Integer currentPage,
                                      @RequestParam(name = "pageSize", defaultValue = "10", required = false) Integer pageSize,
                                      @RequestParam(name = "searchContent", required = false) String searchContent) {
        return EmpService.getEmp(new Page<>(currentPage, pageSize),searchContent);
    }

    @PostMapping("/emp")
    public int updata(@RequestBody Employee updateEmp) {
        return EmpService.update(updateEmp);
    }

    @DeleteMapping("/emp")
    public int delete(@RequestParam(name = "empId", required = true) Integer empId) {
        return EmpService.delete(empId);
    }

}
