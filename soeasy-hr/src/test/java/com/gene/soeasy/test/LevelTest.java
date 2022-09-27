package com.gene.soeasy.test;

import com.gene.soeasy.entity.Level;
import com.gene.soeasy.mapper.LevelMapper;
import com.gene.soeasy.hr.service.ILevelService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LevelTest {
    @Autowired
    private LevelMapper levelMapper;
    @Autowired
    private ILevelService levelService;
    @Test
    public void levelMapperTest(){
        Level level = new Level();
        level.setLevelCode("test");
        level.setLevelName("test");
        levelMapper.insert(level);
    }
    @Test
    public void levelService(){
        Level level = new Level();
        level.setLevelCode("test1");
        level.setLevelName("test1");
        levelService.save(level);
    }
}
