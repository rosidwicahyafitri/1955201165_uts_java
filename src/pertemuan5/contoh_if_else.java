/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class contoh_if_else {
    public static void main(String[] args) {
                String nama = JOptionPane.showInputDialog(null, "Apa nama makanannya?");
        int nilai = Integer.parseInt(JOptionPane.showInputDialog(null, "Berapa harga satu porsi?"));
        
        if(nilai >= 50000) {
            JOptionPane.showMessageDialog(null, "Selamat " + nama + ",pesanan berhasil");
            
        }else{
            JOptionPane.showMessageDialog(null, " maaf " + nama + ",pesanan gagal !");
        }
    }
    
}
