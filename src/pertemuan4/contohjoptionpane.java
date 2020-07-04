/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class contohjoptionpane {
    public static void main(String[] args) {
         String nama_universitas;
        String letak_universitas;
        int tahun_berdiri;
        int jumlah_prodi;
        double ipk_tertinggi;
      
        // mengisi variabel nama dengan JoptionPane
        nama_universitas = JOptionPane.showInputDialog("Apa Nama universitas?");
        letak_universitas = JOptionPane.showInputDialog("Dimana letak universitas?");
        tahun_berdiri = Integer.parseInt(JOptionPane.showInputDialog("Berapa tahun berdiri?"));
        jumlah_prodi = Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah prodi?"));
        ipk_tertinggi = Double.parseDouble(JOptionPane.showInputDialog("Berapa ipk terfavorit?"));
        
        // menampilkan input
        JOptionPane.showMessageDialog(null, "Nama universitasmu adalah " + nama_universitas);
        JOptionPane.showMessageDialog(null, "Letak universitasmu adalah " + letak_universitas);
        JOptionPane.showMessageDialog(null, "Tahun berdirinya adalah " + tahun_berdiri);
        JOptionPane.showMessageDialog(null, "Jumlah prodinya adalah " + jumlah_prodi);
        JOptionPane.showMessageDialog(null, "Ipk tertinggi adalah " + ipk_tertinggi);
    }
    
}
