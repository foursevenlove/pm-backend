package com.foursevenlove.pm.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foursevenlove.pm.IService.IPoliticService;
import com.foursevenlove.pm.IService.IPositionService;
import com.foursevenlove.pm.Mapper.PoliticMapper;
import com.foursevenlove.pm.Mapper.PositionMapper;
import com.foursevenlove.pm.entity.Politicsstatus;
import com.foursevenlove.pm.entity.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PositionServiceImpl implements IPositionService {
    @Autowired
    private PositionMapper positionMapper;

    @Override
    public Map<String, Object> getPosition() {
        Map<String, Object> map = new HashMap<>();
        IPage<Position> positionIPage = positionMapper.selectPage(new Page<>(1, 100),null);
        map.put("pageNum", positionIPage.getPages());
        map.put("pageSize", positionIPage.getSize());
        map.put("total", positionIPage.getTotal());
        List<Position> result = positionIPage.getRecords();
        map.put("list", result);
        return map;
    }
}
