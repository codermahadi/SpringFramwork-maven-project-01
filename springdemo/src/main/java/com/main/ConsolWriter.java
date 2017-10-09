package com.main;

import org.springframework.stereotype.Component;

/**
 * Created by Mahadi on 10/7/2017.
 */
@Component
public class ConsolWriter implements LogWritter{

    public void writer(String text){
        System.out.println(text);
    }
}
