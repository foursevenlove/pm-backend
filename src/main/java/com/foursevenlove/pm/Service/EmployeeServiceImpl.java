package com.foursevenlove.pm.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foursevenlove.pm.IService.IEmployeeService;
import com.foursevenlove.pm.Mapper.EmployeeMapper;
import com.foursevenlove.pm.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Map<String, Object> getEmp(Page<Employee> pageInfo,String searchContent) {
        Map<String, Object> map = new HashMap<>();
        IPage<Employee> basicEmpIPage = employeeMapper.getAll(pageInfo, searchContent);
        map.put("pageNum", basicEmpIPage.getPages());
        map.put("pageSize", basicEmpIPage.getSize());
        map.put("total", basicEmpIPage.getTotal());
        List<Employee> result = basicEmpIPage.getRecords();
        map.put("list", result);
        return map;
    }

    @Override
    public int update(Employee updateEmp) {
        return employeeMapper.updateById(updateEmp);
    }
}
