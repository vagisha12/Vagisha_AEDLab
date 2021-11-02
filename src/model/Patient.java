/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author vagishadeo
 */
public class Patient
{
    private EncounterBackground encounterBackground;
    private Person person;

    public Patient(Person person)
    {
        encounterBackground = new EncounterBackground();
        this.person = person;
    }
    
    public EncounterBackground getencounterBackground() {
        return encounterBackground;
    }

    public void setencounterBackground(EncounterBackground encounterBackground) {
        this.encounterBackground = encounterBackground;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
}
