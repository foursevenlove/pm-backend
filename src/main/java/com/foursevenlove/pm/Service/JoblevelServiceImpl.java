package com.foursevenlove.pm.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foursevenlove.pm.IService.IJoblevelService;
import com.foursevenlove.pm.Mapper.JoblevelMapper;
import com.foursevenlove.pm.entity.Joblevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JoblevelServiceImpl implements IJoblevelService {
    @Autowired
    private JoblevelMapper joblevelMapper;

    @Override
    public Map<String, Object> getJoblevel() {
        Map<String, Object> map = new HashMap<>();
        IPage<Joblevel> joblevelIPage = joblevelMapper.selectPage(new Page<>(1, 100),null);
        map.put("pageNum", joblevelIPage.getPages());
        map.put("pageSize", joblevelIPage.getSize());
        map.put("total", joblevelIPage.getTotal());
        List<Joblevel> result = joblevelIPage.getRecords();
        map.put("list", result);
        return map;
    }
}
