package com.example;

import com.example.entity.Time;
import com.example.service.TimeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AsmApplicationTests {
    @Autowired
    private TimeService timeService;
    @Test
    void contextLoads() {

    }

}
