/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.person;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public Person createEmployee(){
        Person employee = new Person();
        personList.add(employee);
        return employee;
    }
}