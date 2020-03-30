package com.taipingyang.Mapper;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.taipingyang.entity.Commont;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ComontTest {

    @Autowired
    private  CommontMapper commontMapper;

    @Test
    public void dd(){
        List<Commont> list = commontMapper.getList(null);
    }
}
