/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ashis
 */
public class Person
{
    private String person_name;
    private String person_age;
    private Patient patient;

    public Person() {
        patient = new Patient(this);
    }

    public Person(String person_name, String person_age) {
        this.person_name = person_name;
        this.person_age = person_age;
    }
    
    
    
    public String getperson_name() {
        return person_name;
    }

    public void setperson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getperson_age() {
        return person_age;
    }

    public void setperson_age(String person_age) {
        this.person_age = person_age;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public String toString()
    {
        return this.person_name;
    }
    
}
