package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/** * Created by Mahadi on 9/27/2017.
 */
public class App {

    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");


        Cat cat = (Cat) context.getBean("cat");
        cat.speak();

    }
}
