/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author asus
 */
public class contohBufferedReader {
    public static void main(String[] args) throws IOException {
         String nama_barang = "";
        String harga_barang = "";
        String tgl_pengemasan = "";
        String tgl_pengiriman  = "";
        String tgl_diterima = "";
        
        
        // object inputStream
        InputStreamReader isr = new InputStreamReader(System.in);
       
        // object BufferedReader
        BufferedReader br = new BufferedReader(isr);
        
        // mengisi variabel nama dengan BufferedReader
        System.out.println("Apa nama barang?");
        nama_barang = br.readLine();
        
        System.out.println("Berapa harga barang?");
        harga_barang = br.readLine();
        
        System.out.println("Kapan tgl pengemasan?");
        tgl_pengemasan = br.readLine();
        
        System.out.println("Kapan tgl pengiriman?");
        tgl_pengiriman = br.readLine();
        
        System.out.println("Kapan tgl diterima?");
        tgl_diterima = br.readLine();
        
        
        // menampilkan nama
        System.out.println("Nama barang anda adalah " + nama_barang);
        System.out.println("Harga barang Anda adalah " + harga_barang);
        System.out.println("Tgl pengiriman barang Anda adalah " + tgl_pengemasan);
        System.out.println("Tgl pengemasan barang Anda adalah " + tgl_pengiriman);
        System.out.println("Tgl diterima barang anda adalah " + tgl_diterima);
    }
    
}
