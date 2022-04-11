/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppemlan;
import java.util.Scanner;
/**
 *
 * @author MIFZ
 */

class Persegi{
    private int sisi, luas;
    
    public void setSisi(int input){
        sisi = input;
    }
    private void hitungLuas(){
        luas = sisi * sisi;
    }
    public int getLuas(){
        hitungLuas();
        return luas;
    }
}

class Segitiga{
    private int alas, tinggi, luas;
    
    public void setAlas(int input){
        alas = input;
    }
    public void setTinggi(int input){
        tinggi = input;
    }
    private void hitungLuas(){
        luas = alas * tinggi / 2;
    }
    public int getLuas(){
        hitungLuas();
        return luas;
    }
}

class Lingkaran{
    private int jari2;
    
    public void setJari2(int input){
        jari2 = input;
    }
    void getLuas(){
        if (jari2 % 7 == 0) {
            double luas = 22/7 * jari2 * jari2;
            int output = (int)luas;
            System.out.print((double)output);
        }
        else {
            double luas = 3.14 * jari2 * jari2;
            int output = (int)luas;
            System.out.print((double)output);
        }
    }
}

public class MenghitungLuas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int pilih = sc.nextInt();
        
        if (pilih == 1) {
            Persegi objek1 = new Persegi();
            int sisi = sc.nextInt();
            objek1.setSisi(sisi);
            
            System.out.println(objek1.getLuas());
        }
        else if (pilih == 2) {
            Segitiga objek2 = new Segitiga();
            int alas = sc.nextInt();
            int tinggi = sc.nextInt();
            objek2.setAlas(alas);
            objek2.setTinggi(tinggi);
            
            System.out.println(objek2.getLuas());
        }
        else if (pilih == 3) {
            Lingkaran objek3 = new Lingkaran();
            int jari2 = sc.nextInt();
            objek3.setJari2(jari2);
            
            objek3.getLuas();
        }
        else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}

