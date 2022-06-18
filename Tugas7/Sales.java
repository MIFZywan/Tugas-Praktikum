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
public class Sales extends Pegawai {
    private int penjualan ;
    private double komisi ;

    Sales(String nama, String noKTP, int penjualan, double komisi){
        super(nama, noKTP);
        
        this.penjualan = penjualan ;
        this.komisi = komisi ;
    }
    
    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }
    
    public int getPenjualan() {
        return penjualan;
    }
    
    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }
    
    public double getKomisi() {
        return komisi;
    }

    @Override
    public double gaji() {
        return super.gaji() + getPenjualan() * getKomisi();
    }

    @Override
    public String toString() {
        return  "Sales\t" + super.toString() + "\n" +
                "Total penjualan\t: " + getPenjualan() + "\n" +
                "Besaran komisi\t: " + getKomisi() + "\n" +
                "Pendapatan\t: " + "Rp " + (int)gaji() + "\n" +
                "-------------------------------------------------";
    }
}
