package com.main;

/**
 * Created by Mahadi on 9/27/2017.
 */
public class PatientFactory {

    public Test createPatient(int id, String name){
        System.out.println("Using Factory Class to create Patient");
        return new Test(id, name);
    }

}
