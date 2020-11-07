package com.rychlik.springhttpclient.servicesJokesAPI;


import com.rychlik.springhttpclient.api.domain2.Jokes;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImplJokesProgramming implements ApiServicesJokesProgramming {

    private RestTemplate restTemplate;

    public ApiServiceImplJokesProgramming(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Jokes[] getJokes(String type) {

        Jokes[] jokes = restTemplate.getForObject("https://official-joke-api.appspot.com/jokes/"+type+"/random", Jokes[].class);
        return jokes;
    }

}