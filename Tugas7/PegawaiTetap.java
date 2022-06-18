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
public class PegawaiTetap extends Pegawai{
    private double upah;
    
    PegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        
        this.upah = upah ;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah ;
    }

    @Override
    public double gaji() {
        return super.gaji() + getUpah();
    }
    
    @Override
    public String toString() {
        return  "Pengawai Tetap" + super.toString() + "\n" +
                "Upah\t\t: " + (int)getUpah() + "\n" +
                "Pendapatan\t: " + "Rp " + (int)gaji() + "\n" +
                "-------------------------------------------------";
    }
}
