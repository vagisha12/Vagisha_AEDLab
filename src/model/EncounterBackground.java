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
public class EncounterBackground
{
    private List<Encounter> encounterArray;

    public EncounterBackground()
    {
        encounterArray = new ArrayList<>();
    }

    public List<Encounter> getencounterArray() {
        return encounterArray;
    }

    public void setencounterArray(List<Encounter> encounterArray) {
        this.encounterArray = encounterArray;
    }
    
    public void enterEncounter(Encounter encounter) {
        encounterArray.add(encounter);
    }
}
