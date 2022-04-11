/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas;

import java.util.*;

/**
 *
 * @author MIFZ
 */       
public class Store{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga Rp 100.000");
        System.out.println("Baju B dengan harga Rp 125.000");
        System.out.println("Baju C dengan harga Rp 175.000");
        System.out.print("Baju yang akan anda beli bertipe : ");
        String jenis = sc.next();
        System.out.print("Jumlah Baju yang akan anda beli adalah : ");
        int jumlah = sc.nextInt();
        
        Baju baju = new Baju();
        
        if (jenis.equalsIgnoreCase("a")) {
            System.out.println("Jenis yang anda beli : " + jenis);
            baju.getHargaA(jumlah);
        }
        else if (jenis.equalsIgnoreCase("b")) {
            System.out.println("Jenis yang anda beli : " + jenis);
            baju.getHargaB(jumlah);
        }
        else if (jenis.equalsIgnoreCase("c")) {
            System.out.println("Jenis yang anda beli : " + jenis);
            baju.getHargaC(jumlah);
        }
    }
}
class Baju{
    final int bajuA = 100000;
    final int bajuB = 125000;
    final int bajuC = 175000;

    String jenis;
    int harga;
    int jumlah;
    
    
    void getHargaA(int input){
        jumlah = input;
        if (jumlah >= 100) {
            harga = (bajuA - 5000);
            System.out.println("Harga per buah       : "+ harga);
            System.out.println("Total harga          : "+ harga * jumlah);
        }
        else {
            harga = bajuA;
            System.out.println("Harga per buah       : "+ harga);
            System.out.println("Total harga          : "+ harga * jumlah);
        }
    }
    void getHargaB(int input){
        jumlah = input;
        if (jumlah >= 100) {
            harga = (bajuB - 5000);
            System.out.println("Harga per buah       : "+ harga);
            System.out.println("Total harga          : "+ harga * jumlah);
        }
        else {
            harga = bajuB;
            System.out.println("Harga per buah       : "+ harga);
            System.out.println("Total harga          : "+ harga * jumlah);
        }
    }
    void getHargaC(int input){
        jumlah = input;
        if (jumlah >= 100) {
            harga = (bajuC - 15000);
            System.out.println("Harga per buah       : "+ harga);
            System.out.println("Total harga          : "+ harga * jumlah);
        }
        else {
            harga = bajuC;
            System.out.println("Harga per buah       : "+ harga);
            System.out.println("Total harga          : "+ harga * jumlah);
        }
    }
}
