package com.rychlik.springhttpclient.servicesJokesAPI;

import com.rychlik.springhttpclient.api.domain2.Jokes;

public interface ApiServicesJokesProgramming {
    Jokes[] getJokes(String type);
}
