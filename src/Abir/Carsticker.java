/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abir;

/**
 *
 * @author Abir
 */
public class Carsticker {
    String name,mobileNumber,nid;

    public void setName(String name) {
        this.name = name;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getNid() {
        return nid;
    }

    public Carsticker(String name, String mobileNumber, String nid) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.nid = nid;
    }
    
}
