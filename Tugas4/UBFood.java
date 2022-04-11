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
public class UBFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 8000));
        DataMerchant.tampilData();
        
        String namaMerc = sc.nextLine();
        String namaProduk = sc.nextLine();
        double harga = sc.nextDouble();
        
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(namaMerc, namaProduk, harga));
        DataMerchant.tampilData();
    }
}
