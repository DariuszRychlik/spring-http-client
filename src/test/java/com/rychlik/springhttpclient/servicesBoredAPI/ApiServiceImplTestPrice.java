package com.rychlik.springhttpclient.servicesBoredAPI;

import com.rychlik.springhttpclient.api.domain1.Bored;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiServiceImplTestPrice {

    @Autowired
    ApiServicesBoredPrice apiServicesBoredPrice;

    @Test
    public void testGetBored() throws Exception {

        Bored bored = apiServicesBoredPrice.getBored(0.5);

        Assertions.assertEquals(0.5, bored.getPrice());

    }
}