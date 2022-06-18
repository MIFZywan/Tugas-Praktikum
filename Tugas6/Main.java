/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;

/**
 *
 * @author MIFZ
 */
import java.util.Arrays;

public class Main {
    static Manusia manusia[];
    static MahasiswaFilkom mahasiswa[];
    static Pekerja pekerja[];
    static Manager manager[];

    public static void main(String[] args) {
        // Class Manusia
        manusia = new Manusia[3];
        System.out.println("=================================================");
        System.out.println(" Class Manusia ");
        System.out.println("=================================================");
        manusia[0] = new Manusia("MIFZ", "3923842934", true, false);
        System.out.println(manusia[0].toString());
        manusia[1] = new Manusia("Ikhwan", "3519238482", true, true);
        System.out.println(manusia[1].toString());
        manusia[2] = new Manusia("Fauzi", "351717969", true, true);
        System.out.println(manusia[2].toString());

        // Class MahasiswaFilkom
        mahasiswa = new MahasiswaFilkom[3];
        System.out.println("=================================================");
        System.out.println(" Class Mahasiswa ");
        System.out.println("=================================================");
        mahasiswa[0] = new MahasiswaFilkom("215150707111023", 4.0, "Kim", "3525017006650078", true, true);
        System.out.println(mahasiswa[0].toString());
        mahasiswa[1] = new MahasiswaFilkom("215150617111111", 3.5, "Murata", "3314076404720003", false, false);
        System.out.println(mahasiswa[1].toString());
        mahasiswa[2] = new MahasiswaFilkom("215150427111222", 3.2, "Jiro", "3326160107400474", true, false);
        System.out.println(mahasiswa[2].toString());

        // Class Pekerja
        pekerja = new Pekerja[3];
        System.out.println("=================================================");
        System.out.println(" Class Pekerja ");
        System.out.println("=================================================");
        pekerja[0] = new Pekerja(7, 21, "201127529647", "Tessa", "351717969", false, true);
        System.out.println(pekerja[0].toString());
        pekerja[1] = new Pekerja(7, 28, "193325829957", "Embul", "351707384392", false, false);
        System.out.println(pekerja[1].toString());
        pekerja[2] = new Pekerja(9, 15, "1842257291648", "Angki", "3923842934", true, true);
        System.out.println(pekerja[2].toString());

        // Class Manager
        manager = new Manager[3];
        System.out.println("=================================================");
        System.out.println(" Class Manager ");
        System.out.println("=================================================");
        manager[0] = new Manager(753, 9, 19, "194225229123", "Killua", "200164744332", true, true);
        System.out.println(manager[0].toString());
        manager[1] = new Manager(1834, 7, 24, "212225729178", "Aluca", "1787456362362", false, false);
        System.out.println(manager[1].toString());
        manager[2] = new Manager(1332, 8, 20, "205225129539", "Roxy", "183475135113", true, false);
        System.out.println(manager[2].toString());

        // Jumlah
        System.out.println("=================================================");
        System.out.println(" Total Keseluruhan yang Terdaftar ");
        System.out.println("=================================================");
        System.out.println("Jumlah Manusia : " + manusia.length);
        System.out.println("Jumlah Mahasiswa : " + mahasiswa.length);
        System.out.println("Jumlah Pekerja : " + pekerja.length);
        System.out.println("Jumlah Manger : "+ manager.length);
        System.out.println("=================================================");
        
    }
}