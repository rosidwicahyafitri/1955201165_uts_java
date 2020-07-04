/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author asus
 */
public class contoh_if_else_if {
    public static void main(String[] args) {
            int nilai_BIOLOGI = 80;
    int nilai_IPA = 100;
      
    if(nilai_BIOLOGI < 70){
      /*
       * Jika nilai/value pada variable nilai_BIOLOGI lebih dari 70 (true)
       * Maka program akan menjalankan statement ini
       */   
      System.out.println("Selamat Wildan kamu lulus ujian BIOLOGI");
    }else if (nilai_IPA > 85){
     /*
      * Jika nilai/value pada variable nilai_BIOLOGI kurang dari 70 (false) dan
      * nilai_IPA lebih dari 85 (true). maka program akan menjalankan statement ini
      */   
     System.out.println("Wildan kamu lulus pada pelajaran IPA");
    }else {
      /*
       * Dan jika semua statement tidak ada yang memenuhi syarat atau
       * bernilai false. maka program akan menjalankan statement ini
       */  
      System.out.println("Mohon maaf Wildan kamu tidak lulus");
    }
  }
}

    
    

    