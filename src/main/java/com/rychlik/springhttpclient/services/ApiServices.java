package com.rychlik.springhttpclient.services;

import com.rychlik.springhttpclient.api.domain.Fact;

public interface ApiServices {
    Fact[] getFacts(Integer amount);
}
