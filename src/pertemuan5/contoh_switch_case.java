/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class contoh_switch_case {
    public static void main(String[] args) {
          int bulan = 7;
        System.out.println("Bulan Ke-"+bulan);
        
        switch(bulan){
            case 1 : 
                System.out.println("Bulan januari");
             break;
            case 2 : 
                System.out.println("Bulan februari");
             break;
            case 3 : 
                System.out.println("Bulan maret");
             break;
            case 4 : 
                System.out.println("Bulan april");
             break;
            case 5 : 
                System.out.println("Bulan mei");
             break;
            case 6 : 
                System.out.println("Bulan juni");
             break;
            case 7 : 
                System.out.println("Bulan juli");
             break;
            case 8 : 
                System.out.println("Bulan agustus");
             break;
            case 9 : 
                System.out.println("Bulan september");
             break;
            case 10 : 
                System.out.println("Bulan oktober");
             break;
            case 11 : 
                System.out.println("Bulan november");
             break;
            case 12 : 
                System.out.println("Bulan desember");
             break;
            default: 
                System.out.println("Tidak Ditemukan Bulan Ke-"+bulan);
            break;
        }
    }
}


    
