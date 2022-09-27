package com.gene.soeasy.test;

import com.gene.soeasy.entity.Position;
import com.gene.soeasy.mapper.PositionMapper;
import com.gene.soeasy.hr.service.IPositionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PositionTest {
    @Autowired
    private PositionMapper positionMapper;
    @Autowired
    private IPositionService positionService;
    @Test
    public void positionMapperTest(){
        Position position = new Position();
        position.setPositionCode("test");
        position.setPositionName("test");
        positionMapper.insert(position);
    }
    @Test
    public void positionServiceTest(){
        Position position = new Position();
        position.setPositionCode("test1");
        position.setPositionName("test1");
        positionService.save(position);
    }

}
