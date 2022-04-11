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
public class SuratKaisar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata;
        int pergeseran;
        
        kata = sc.nextLine();
        pergeseran = sc.nextInt();
        
        geser(kata, pergeseran);
    }  
    
    static void geser(String kata, int pergeseran){
        String geser = "";
        char huruf;
        
        for (int i = 0; i < kata.length(); i++) {
            huruf = kata.charAt(i);
            
            if (huruf >= 'a' && huruf <= 'z') {
                huruf = (char) (huruf + pergeseran);
                if (huruf > 'z') {
                    huruf = (char) (huruf + 'a' - 'z' - 1);
                }
                geser = geser + huruf;
            }
            else if (huruf >= 'A' && huruf <= 'Z') {
                huruf = (char) (huruf + pergeseran);
                if (huruf > 'Z') {
                    huruf = (char) (huruf + 'A' - 'Z' - 1);
                }
                geser = geser + huruf;
            }
            else {
                geser = geser + huruf;
            }
        }
        System.out.println(geser);
    }
}
