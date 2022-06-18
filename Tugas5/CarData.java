/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;

import java.util.ArrayList;

/**
 *
 * @author MIFZ
 */
public class CarData {
    ArrayList<Car> carList = new ArrayList<>();
    
    public void addCar (String carType, String polNum, String merk){
        carList.add(new Car(carType, polNum, merk));
    }
    
    public void listOfCar(){
        System.out.println("---------------------------------------------");
        System.out.println("  DAFTAR MOBIL");
        System.out.println("---------------------------------------------");
        for (Car i : carList) {
            System.out.println("TIPE MOBIL\t\t: "+ i.getCarType());
            System.out.println("No. POLISI\t\t: "+ i.getPolNum());
            System.out.println("MERK MOBIL\t\t: "+ i.getMerk());
            System.out.println("---------------------------------------------");
        }
    } 
}
