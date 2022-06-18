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
public class Titan extends Character{
    private int HP;
    private int attack;
    private int defense;
    
    Titan(int HP, int attack, int defense){
        super(defense, attack, HP);
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }
    
    public boolean attack(){
        double Hit = Math.random();
        if(Hit < 0.4) {
        return true;
    }
    return false;
    }  
}
