/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class contohscanner {
    public static void main(String[] args) {
        String nama = "";
         int nim = 0;
         String alamat = "";
         String prodi = "";
         double ipk = 0.0;
         
         // Membuat scanner
         System.out.println("Siapa Anda?");
         Scanner keyboard = new Scanner(System.in);
         nama = keyboard.next();
         
         System.out.println("Berapa NIM Anda?");
         Scanner inputUser = new Scanner(System.in);
         nim = Integer.parseInt (inputUser.nextLine());
         
         System.out.println("Dimana Alamat Anda?");
         alamat = keyboard.next();
         
         System.out.println("Prodi Apa Yang Anda Ambil?");
         prodi = keyboard.next();
         
         System.out.println("Berapa Ipk Anda pada Semester ini?");
         ipk = keyboard.nextDouble();
         
         //output
         System.out.println("Nama: " + nama);
         System.out.println("NIM: " + nim);
         System.out.println("Alamat: " + alamat);
         System.out.println("Prodi: " + prodi);
         System.out.println("Ipk: " + ipk);
    }
    
}
