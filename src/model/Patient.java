/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ashis
 */
public class Patient
{
    private EncounterHistory encounterBackground;
    private Person person;

    public Patient(Person person)
    {
        encounterBackground = new EncounterHistory();
        this.person = person;
    }
    
    public EncounterHistory getencounterBackground() {
        return encounterBackground;
    }

    public void setencounterBackground(EncounterHistory encounterBackground) {
        this.encounterBackground = encounterBackground;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
}
