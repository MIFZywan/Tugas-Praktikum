/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas7;

/**
 *
 * @author MIFZ
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("=================================================");
        System.out.println(" \t\tPegawai Tetap ");
        System.out.println("=================================================");
        PegawaiTetap pegawaitetap1 = new PegawaiTetap("Bayu","350728490327424892341", 20000000);
        System.out.println(pegawaitetap1);
        PegawaiTetap pegawaitetap2 = new PegawaiTetap("Ubay","350728490327424892342", 15000000);
        System.out.println(pegawaitetap2);
        PegawaiTetap pegawaitetap3 = new PegawaiTetap("Buay","350728490327424892343", 10000000);
        System.out.println(pegawaitetap3);

        System.out.println("=================================================");
        System.out.println(" \t\tPegawai Harian ");
        System.out.println("=================================================");
        PegawaiHarian pegawaiharian1 = new PegawaiHarian("Edo","350728490327424892344", 8500, 40);
        System.out.println(pegawaiharian1);
        PegawaiHarian pegawaiharian2 = new PegawaiHarian("Ode","350728490327424892345", 9000, 42);
        System.out.println(pegawaiharian2);
        PegawaiHarian pegawaiharian3 = new PegawaiHarian("Deo","350728490327424892346", 10000, 29);
        System.out.println(pegawaiharian3);
        
        System.out.println("=================================================");
        System.out.println(" \t\t   Sales ");
        System.out.println("=================================================");
        Sales sales1 = new Sales("Tika", "350728490327424892347", 50, 50000);
        System.out.println(sales1);
        Sales sales2 = new Sales("Ika", "350728490327424892348", 55, 45000);
        System.out.println(sales2);
        Sales sales3 = new Sales("Aki", "350728490327424892349", 60, 40000);
        System.out.println(sales3);
    }
}
