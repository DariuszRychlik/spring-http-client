package com.rychlik.springhttpclient.servicesBoredAPI;

import com.rychlik.springhttpclient.api.domain1.Bored;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImplBoredPrice implements ApiServicesBoredPrice {

    private RestTemplate restTemplate;

    public ApiServiceImplBoredPrice(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Bored getBored(Double price) {

        Bored bored = restTemplate.getForObject("http://www.boredapi.com/api/activity?price="+price, Bored.class);
        return bored;
    }

}

