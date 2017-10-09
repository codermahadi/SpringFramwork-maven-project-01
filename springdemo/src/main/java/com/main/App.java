package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

/** * Created by Mahadi on 9/27/2017.
 */
public class App {

    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        NoticesDAO noticesDAO = (NoticesDAO) context.getBean("noticesDAO");

        List<Notice> notices = noticesDAO.getNotices();

        for (Notice notice:notices){
            System.out.println(notice);
        }

    }
}
