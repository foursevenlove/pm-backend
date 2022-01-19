package com.foursevenlove.pm.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foursevenlove.pm.entity.Employee;
import com.foursevenlove.pm.response.BasicEmp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
    IPage<Employee> getAll(Page<?> pageInfo, @Param("searchContent") String searchContent);

}
