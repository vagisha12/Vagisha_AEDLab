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
public class Town
{
    private String town;
    private String state;
    private List<Community> communityArray;

    public Town() {
        this.communityArray = new ArrayList<>();
    }

    public Town(String town, String state) {
        this.town = town;
        this.state = state;
        this.communityArray = new ArrayList<>();
    }
    
    

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Community> getcommunityArray() {
        return communityArray;
    }

    public void setcommunityArray(List<Community> communityArray) {
        this.communityArray = communityArray;
    }
    
    public Community enterCommunity() {
        Community community = new Community();
        communityArray.add(community);
        return community;
    }
    
    public String toString()
    {
        return this.town;
    }
}
