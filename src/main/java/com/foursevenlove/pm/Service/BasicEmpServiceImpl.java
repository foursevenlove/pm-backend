package com.foursevenlove.pm.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foursevenlove.pm.IService.IBasicEmpService;
import com.foursevenlove.pm.Mapper.BasicEmpMapper;
import com.foursevenlove.pm.response.BasicEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BasicEmpServiceImpl implements IBasicEmpService {

    @Autowired
    private BasicEmpMapper basicEmpMapper;

    @Override
    public Map<String, Object> getEmp(Page<BasicEmp> pageInfo,String searchContent) {
        Map<String, Object> map = new HashMap<>();
        IPage<BasicEmp> basicEmpIPage = basicEmpMapper.getAll(pageInfo, searchContent);
        map.put("pageNum", basicEmpIPage.getPages());
        map.put("pageSize", basicEmpIPage.getSize());
        List<BasicEmp> result = basicEmpIPage.getRecords();
        map.put("list", result);
        return map;
    }
}
