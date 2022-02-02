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
    public Map<String, Object> getEmp(Page<Employee> pageInfo,String searchContent, String politicId, String nationId,
                                      String jobLevelId, String posId, String engageForm) {
        Map<String, Object> map = new HashMap<>();
        IPage<Employee> basicEmpIPage = employeeMapper.getAll(pageInfo, searchContent, politicId, nationId, jobLevelId, posId, engageForm);
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

    @Override
    public int delete(Integer empId) {
        return employeeMapper.deleteById(empId);
    }
}
