//Serialization is the process of converting an object into a
// stream of bytes to store the object or transmitit to memory,
// a database, or a file. Its main purpose is to save the state
// of an object in order to be able to recreate it when needed.
// The reverse process is called deserialization.


package com.company;

import java.io.Serializable;

class JA03_Serializaion implements Serializable {


    private String name;
    private int age;
    private String address;


    JA03_Serializaion(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return ("Student Name is "+this.getName()+", age is"+this.getAge()+" and the address is "+this.getAddress());
    }
}
