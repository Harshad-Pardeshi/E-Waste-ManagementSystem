/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.person;

/**
 *
 * @author raunak
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private StringBuilder address;
    private int age;
    private int id;
    private static int count = 1;

    public Person() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public StringBuilder getAddress() {
        return address;
    }

    public void setAddress(StringBuilder address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName;
    } 
}
