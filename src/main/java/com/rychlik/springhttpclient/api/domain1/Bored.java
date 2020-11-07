package com.rychlik.springhttpclient.api.domain1;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
public class Bored implements Serializable
{

    public String activity;
    public String type;
    public Integer participants;
    public Double price;
    public String link;
    public String key;
    public Double accessibility;
    public int getParticipants;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5061638338973654150L;

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


}