package com.main;

/**
 * Created by Mahadi on 9/27/2017.
 */
public class Test {

    private int id;
    private String name;
    private int nationalid;

    private Address address;

    public Test(){

    }

    public static Test getInstance(int id, String name){

        System.out.println("Creating Test using factory method");
        return new Test(id, name);
    }

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void onCrete(){
        System.out.println("Init Method " + this);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNationalid() {
        return nationalid;
    }

    public void setNationalid(int nationalid) {
        this.nationalid = nationalid;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nationalid=" + nationalid +
                ", address=" + address +
                '}';
    }

    public void speak(){
        System.out.println("Help Me");
    }
    public void onDestoy(){
        System.out.println("data Existing...");
    }
}
