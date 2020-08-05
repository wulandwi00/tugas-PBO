/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */
public class Kupukupu {
    private String warna;
    private int jumlah ;
    
  public Kupukupu(String warna,int jumlah){
       this.warna = warna;
       this.jumlah = jumlah;
       System.out.println("Inisialisasi Atribut");
   }
            
    void terbang (){
        System.out.println("Kupukupu terbangke atas");
        }
    void hinggap () {
        System.out.println("Kupukupu sedang hinggap di bunga");
        
    }
    void tampilData(){
        System.out.println("warna :"+this.warna);
        System.out.println("jumlah :"+this.jumlah);
}
    
}
