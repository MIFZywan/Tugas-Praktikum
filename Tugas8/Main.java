/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas8;

import java.util.Scanner;

/**
 *
 * @author MIFZ
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Magician magic = new Magician(100, 60, 10);
        Healer healer = new Healer(70, 10, 10);
        Warrior warrior = new Warrior(80, 25, 30);
        Titan titan = new Titan(200, 45, 0);
 
        System.out.println("Selamat datang di game Defend FILKOM !");
        System.out.print("Silahkan masukkan nama player : ");
        String nama = sc.nextLine();
        int choose = 0;
        do{
            try{
                System.out.println("Silahkan pilih karakter yang anda inginkan :");
                String[] Role = {"1. Magician", "2. Healer", "3. Warrior"};
                for(String Hero : Role) {
                    System.out.println(Hero);
                }
                choose = sc.nextInt();
                
                if (choose < 1 || choose > 3) throw new NumberFormatException();
                }catch (Exception e){
                if(e instanceof NumberFormatException) {
                    System.out.println("Hanya tersedia angka 1 - 3");
                }
                else{
                    System.err.println("Tolong Masukan Angka");
                    sc.next();
                }
             }
        }
        while (choose == 0);
            System.out.println("Selamat datang, " + nama);
 
        switch(choose){
            case 1 :
                int i = 1;
                magic.info();
                while(magic.getHp() != 0 && titan.getHp() != 0){
                    System.out.println("============" + " TURN " + i + " ============");
                    
                    if(magic.attack()){
                        titan.receiveDamage(magic.getAttack());
                    }
                    if(titan.attack()){
                        magic.receiveDamage(titan.getAttack()); 
                    }
                    System.out.println("Enemy's HP\t: " + titan.getHp());
                    System.out.println(nama +"'s HP\t: " + magic.getHp());
                    i++;
                }
                System.out.println("====================================");
                if(titan.getHp() == 0) {
                    System.out.println(nama + " menang\n");
                }
                if(magic.getHp() == 0) {
                    System.out.println("Titan menang\n");
                }
                System.out.println("============== PLAYER ==============");
                magic.info();
                System.out.println();
                System.out.println("============== MUSUH ==============");
                titan.info();
            break;
 
            case 2 :
                int j = 1;
                healer.info();
                while(healer.getHp()!= 0 && titan.getHp() != 0){
                System.out.println("==============" + " TURN " + j + " ==============");
                if(j % 2 == 0) {
                    healer.Heal();
                }
                if(healer.attack()){
                    titan.receiveDamage(healer.getAttack());
                }
                if(titan.attack()){
                    healer.receiveDamage(titan.getAttack()); 
                }
                    System.out.println("Enemy's HP\t: " + titan.getHp());
                    System.out.println(nama +"'s HP\t: " + healer.getHp());
                j++;
                }
                System.out.println("====================================");
                if(titan.getHp() == 0) 
                    System.out.println(nama + " menang\n");
                if(healer.getHp() == 0) 
                    System.out.println("Titan menang\n");
                System.out.println("============== PLAYER ==============");
                healer.info();
                System.out.println();
                System.out.println("============== MUSUH ==============");
                titan.info();
            break;
 
            case 3 :
                int k = 1;
                warrior.info();
                while(warrior.getHp() != 0 && titan.getHp() != 0){
                System.out.println("==============" + " TURN " + k + " ==============");
                if(warrior.attack()){
                    titan.receiveDamage(warrior.getAttack());
                }
                if(titan.attack()){
                    warrior.receiveDamage(titan.getAttack()); 

                }
                System.out.println("Enemy's HP\t: " + titan.getHp());
                System.out.println(nama +"'s HP\t: " + warrior.getHp());
                k++;
                }
                System.out.println("====================================");
                    if(titan.getHp() == 0) 
                        System.out.println(nama + " menang\n");
                    if(warrior.getHp() == 0) 
                        System.out.println("Titan menang\n");
                System.out.println("============== PLAYER ==============");
                warrior.info();
                System.out.println();
                System.out.println("============== MUSUH ==============");
                titan.info();
                break;
            }
    }
    
}