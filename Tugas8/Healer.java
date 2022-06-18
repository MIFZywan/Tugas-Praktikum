/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas8;

/**
 *
 * @author MIFZ
 */
public class Healer extends Character{
    private int HP;
    private int attack;
    private int defense;
    
    Healer(int HP, int attack, int defense){
        super(defense, attack, HP);
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }
    
    public boolean attack(){
        double Hit = Math.random();
            if(Hit < 0.85){
            return true;
    }
    return false;
    }
    
    public void Heal(){
        System.out.println("Menggunakan skill heal");
    }
    
    public int getHp(){
        return HP + 25;
    }
    
    public void setHp(int HP){
    System.out.println(this.HP);
    }
}
