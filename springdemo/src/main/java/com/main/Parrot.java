package com.main;

import org.springframework.stereotype.Component;

/**
 * Created by Mahadi on 10/9/2017.
 */
@Component
public class Parrot {

    private int id;
    private String speech;

    public void setId(int id) {
        this.id = id;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public void speak(){
        System.out.println(id+" : "+speech);
    }
}
