/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UBFood;

import java.util.Scanner;
/**
 *
 * @author MIFZ
 */
public class DataMerchant {
    static Scanner sc = new Scanner(System.in);
    static Merchant merc[] = new Merchant[0];
    
    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant[] merch = new Merchant[DataMerchant.merc.length + 1];

        for (int i = 0; i < DataMerchant.merc.length; i++){
            merch[i] = merc[i];
        }

        merch[DataMerchant.merc.length] = merchant;
        return merch;
    }
    
    public static void tampilData(){
        for (Merchant mch1 : DataMerchant.merc) {
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama Merchant   : "+ mch1.getNamaMerchant());
            System.out.println("Nama Produk     : "+ mch1.getNamaProduk());
            System.out.println("Harga           : "+ (int)mch1.getHargaMakanan());
        }
    }
    
    public static Merchant cariMerchant(String nama){
        int x = 0;
        for (int i = 0; i < DataMerchant.merc.length; i++){
            if (DataMerchant.merc[i].getNamaMerchant().equals(nama)){
                x = i;
                break;
            }
        }
        return merc[x];
    }
    
    public static void tampilMerchant(Merchant merchant){
        System.out.println("=== Tampilan Data Merchant UBFood ===");
        System.out.println("Nama Merchant   : " + merchant.getNamaMerchant());
        System.out.println("Nama Produk     : " + merchant.getNamaProduk());
        System.out.println("Harga           : " + (int) merchant.getHargaMakanan());
    }
    
    public static void updateMerchant(Merchant merchant, String namaMerc, String produk, double harga){
        merchant.setNamaMerchant(namaMerc);
        merchant.setNamaProduk(produk);
        merchant.setHargaMakanan(harga);
    }
}
