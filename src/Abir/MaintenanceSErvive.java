/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abir;

/**
 *
 * @author Abir
 */
public class MaintenanceSErvive {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getRoadNO() {
        return roadNO;
    }

    public void setRoadNO(String roadNO) {
        this.roadNO = roadNO;
    }

    public MaintenanceSErvive(String name, String mobileNumber, String houseNo, String roadNO) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.houseNo = houseNo;
        this.roadNO = roadNO;
    }
    String name,mobileNumber,houseNo,roadNO;
    
}
