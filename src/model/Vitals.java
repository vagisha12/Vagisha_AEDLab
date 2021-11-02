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
public class Vitals
{
    private String pulse;
    private String temp;
    private String breathRate;
    private String bloodP;

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getbreathRate() {
        return breathRate;
    }

    public void setbreathRate(String breathRate) {
        this.breathRate = breathRate;
    }

    public String getBloodP() {
        return bloodP;
    }

    public void setBloodP(String bloodP) {
        this.bloodP = bloodP;
    }
}
