package com.rychlik.springhttpclient.servicesJokesAPI;
import com.rychlik.springhttpclient.api.domain2.Jokes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiServiceImplTestRandomTen {
    @Autowired
    ApiServicesJokesRandomTen apiServicesJokesRandomTen;

    @Test
    public void testGetJokes() throws Exception {


        Jokes[] jokes = apiServicesJokesRandomTen.getJokes();

        Assertions.assertEquals(10, jokes.length);

    }
}
