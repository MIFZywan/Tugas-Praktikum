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
public class PegawaiHarian extends Pegawai {
    private double upahPerJam ;
    private int totalJam ;

    PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam){
        super(nama, noKTP);
        
        this.upahPerJam = upahPerJam ;
        this.totalJam = totalJam ;
    }
    
    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }
    
    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }
    
    public int getTotalJam() {
        return totalJam;
    }

    @Override
    public double gaji() {
        if (getTotalJam() <= 40){
            return super.gaji() + getTotalJam() * getUpahPerJam();
        }
        else{
            return super.gaji() + getTotalJam() * getUpahPerJam() + (getTotalJam() - 40) * getUpahPerJam() * 1.5 ;
        }

    }

    public String toString() {
        return  "Pengawai Harian" + super.toString() + "\n" +
                "Upah/jam\t: Rp " + getUpahPerJam() + "\n" +
                "Total jam kerja\t: " + getTotalJam() + "\n" +
                "Pendapatan\t: " + "Rp " + (int)gaji() + "\n" +
                "-------------------------------------------------";
    }
}
