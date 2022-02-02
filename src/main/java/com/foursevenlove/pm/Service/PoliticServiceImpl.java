package com.foursevenlove.pm.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foursevenlove.pm.IService.IPoliticService;
import com.foursevenlove.pm.Mapper.PoliticMapper;
import com.foursevenlove.pm.entity.Employee;
import com.foursevenlove.pm.entity.Politicsstatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PoliticServiceImpl implements IPoliticService {
    @Autowired
    private PoliticMapper politicMapper;

    @Override
    public Map<String, Object> getPolitic() {
        Map<String, Object> map = new HashMap<>();
        IPage<Politicsstatus> politicIPage = politicMapper.selectPage(new Page<>(1, 100),null);
        map.put("pageNum", politicIPage.getPages());
        map.put("pageSize", politicIPage.getSize());
        map.put("total", politicIPage.getTotal());
        List<Politicsstatus> result = politicIPage.getRecords();
        map.put("list", result);
        return map;
    }
}
