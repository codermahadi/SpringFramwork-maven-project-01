package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Mahadi on 10/9/2017.
 */
@Component
public class Cat {

    private int id = 0;
    private String speech = "Dont't feel like ";

    @Autowired
    public void setId(@Value("1234") int id) {
        this.id = id;
    }

    @Autowired
    public void setSpeech(@Value("Meow") String speech) {
        this.speech = speech;
    }

    public void speak(){
        System.out.println(id+" : "+speech);
    }
}
