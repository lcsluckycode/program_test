package com.lcs.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;


    public String getName() {
        return name;
    }

    @Value("lcs")
    public void setName(String name) {
        this.name = name;
    }
}
