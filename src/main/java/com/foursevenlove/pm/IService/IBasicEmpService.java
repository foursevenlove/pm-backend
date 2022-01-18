package com.foursevenlove.pm.IService;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foursevenlove.pm.response.BasicEmp;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface IBasicEmpService {
    Map<String, Object> getEmp(Page<BasicEmp> pageInfo,@Param("searchContent") String searchContent);
    int update(BasicEmp updateEmp);
}
