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
public class Community {
    private String communityInfo;
    private List<Address> addressList;

    public Community() {
        addressList = new ArrayList<>();
    }

    public Community(String communityInfo) {
        this.communityInfo = communityInfo;
        addressList = new ArrayList<>();
    }
    

    public String getcommunityInfo() {
        return communityInfo;
    }

    public void setcommunityInfo(String communityInfo) {
        this.communityInfo = communityInfo;
    }

    public List<Address> getaddressList() {
        return addressList;
    }

    public void setaddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
    
    public Address enterAddress()
    {
        Address house = new Address();
        addressList.add(0, house);
        return house;
    }
    
    public String toString()
    {
        return this.communityInfo;
    }
}
