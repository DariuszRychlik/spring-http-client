package com.rychlik.springhttpclient.services;

import com.rychlik.springhttpclient.api.domain.Fact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiServices apiServices;

    @Test
    public void testGetFacts() throws Exception {

        Fact[] facts = apiServices.getFacts(5);

        Assertions.assertEquals(5,facts.length);

    }
}
