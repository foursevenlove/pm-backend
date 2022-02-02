package com.foursevenlove.pm.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foursevenlove.pm.IService.INationService;
import com.foursevenlove.pm.Mapper.NationMapper;
import com.foursevenlove.pm.entity.Nation;
import com.foursevenlove.pm.entity.Politicsstatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NationService implements INationService {
    @Autowired
    private NationMapper nationMapper;

    @Override
    public Map<String, Object> getNation() {
        Map<String, Object> map = new HashMap<>();
        IPage<Nation> nationIPage = nationMapper.selectPage(new Page<>(1, 100),null);
        map.put("pageNum", nationIPage.getPages());
        map.put("pageSize", nationIPage.getSize());
        map.put("total", nationIPage.getTotal());
        List<Nation> result = nationIPage.getRecords();
        map.put("list", result);
        return map;
    }
}
