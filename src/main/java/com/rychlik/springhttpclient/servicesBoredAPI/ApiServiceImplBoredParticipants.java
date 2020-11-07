package com.rychlik.springhttpclient.servicesBoredAPI;

import com.rychlik.springhttpclient.api.domain1.Bored;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImplBoredParticipants implements ApiServicesBoredParticipants {

    private RestTemplate restTemplate;

    public ApiServiceImplBoredParticipants(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Bored getBored(Integer participants) {

        Bored bored = restTemplate.getForObject("http://www.boredapi.com/api/activity?participants="+participants, Bored.class);
        return bored;
    }
}