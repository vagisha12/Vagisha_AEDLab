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
public class PersonData
{
    private List<Person> personArray;

    public PersonData() {
        personArray = new ArrayList<>();
    }

    public List<Person> getpersonArray() {
        return personArray;
    }

    public void setpersonArray(List<Person> personArray) {
        this.personArray = personArray;
    }
}