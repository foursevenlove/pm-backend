package com.foursevenlove.pm.IService;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foursevenlove.pm.entity.Employee;
import com.foursevenlove.pm.response.BasicEmp;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface IEmployeeService {
    Map<String, Object> getEmp(Page<Employee> pageInfo,
                               @Param("searchContent") String searchContent, @Param("politicId") String politicId,
                               @Param("nationId") String nationId, @Param("jobLevelId") String jobLevelId,
                               @Param("posId") String posId, @Param("engageForm") String engageForm);
    int update(Employee updateEmp);
    int delete(Integer empId);
}
