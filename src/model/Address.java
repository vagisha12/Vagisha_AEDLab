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
 * @author vagishadeo
 */
public class Address
{
    private String addressLine1;
    private String addressLine2;
    private String zipcode;
    private List<Person> personArray;

    public Address() {
        personArray = new ArrayList<>();
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getzipcode() {
        return zipcode;
    }

    public void setzipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public List<Person> getpersonArray() {
        return personArray;
    }

    public void setpersonArray(List<Person> personArray) {
        this.personArray = personArray;
    }
    
    public Person enterPerson()
    {
        Person person = new Person();
        personArray.add(0, person);
        return person;
    }
    
    public String toString()
    {
        return this.addressLine1;
    }
}
