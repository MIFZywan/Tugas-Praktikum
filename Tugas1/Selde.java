/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemlan;

import java.util.Scanner;
/**
 *
 * @author MIFZ
 */
public class Selde {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int angka;
        
        angka = sc.nextInt();
        selde(angka);
    }
    
    static void selde(int angka){
        int angkaAwal = angka;
        int balikAngka = 0;
        int remainder;
        
        while (angka !=0) {
            remainder = angka % 10;
            balikAngka = balikAngka * 10 + remainder;
            angka /= 10;
        }
        
        if (angkaAwal == balikAngka) {
            System.out.println(angkaAwal + " adalah selde.");
        }
        else {
            System.out.println(angkaAwal + " bukan selde.");
        }
    }
}