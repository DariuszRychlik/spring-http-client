package com.rychlik.springhttpclient.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Fact implements Serializable
{

    public Boolean used;
    public String source;
    public String type;
    public Boolean deleted;
    public String id;
    public Integer v;
    public String text;
    public String updatedAt;
    public String createdAt;
    public Status status;
    public String user;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6214297431557197905L;

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
