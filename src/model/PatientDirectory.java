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
public class PatientDirectory
{
    private List<Patient> patientArray;

    public PatientDirectory() {
        patientArray = new ArrayList<>();
    }

    public List<Patient> getpatientArray() {
        return patientArray;
    }

    public void setpatientArray(List<Patient> patientArray) {
        this.patientArray = patientArray;
    }
    
}
