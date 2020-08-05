/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */
public class Utama {
    public static void main(String[] args) {
        
        String warna = "Merah";
        int jumlah = 10;
        
        Kupukupu kupu = new Kupukupu(warna, jumlah);
        kupu.terbang();
        kupu.hinggap();
        kupu.tampilData();
    }
}
