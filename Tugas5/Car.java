/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;

/**
 *
 * @author MIFZ
 */
public class Car {
    private String carType;
    private String polNum;
    private String merk;
    private boolean status = true;
    
    public Car (String carType, String polNum, String merk){
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
    }
    
    public String getCarType(){
        return carType;
    }
    
    public String getPolNum(){
        return polNum;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public boolean isStatus(){
        return status;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
}
