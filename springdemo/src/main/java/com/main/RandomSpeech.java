package com.main;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Mahadi on 10/9/2017.
 */
@Component
public class RandomSpeech {

    private String[] texts = {
            "I'll be back",
            "Get Out",
            "I want yous clothes, boots and motorcycle",
            null
    };

    public String getText(){
        Random random = new Random();
        return texts[random.nextInt(texts.length)];
    }
}
