package com.rychlik.springhttpclient.services;

import com.rychlik.springhttpclient.api.domain.Fact;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImpl implements ApiServices{

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Fact[] getFacts(Integer amount) {

        Fact[] facts = restTemplate.getForObject("https://cat-fact.herokuapp.com/facts/random?animal_type=cat&amount="+amount, Fact[].class);
        return facts;
    }
}
