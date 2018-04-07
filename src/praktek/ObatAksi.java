/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek;

/**
 *
 * @author win 10
 */
public class ObatAksi {
    public static void main (String[] args) {
        Obat cair = new Obat();
        Obat tablet = new Obat();
        Obat serbuk = new Obat();
        
        cair.merk="Hufagrip";
        cair.jenis="Zat Cair";
        cair.isi="125 ml";
        cair.warna="Merah";
        cair.kemasan="Botol Kaca";
        
        tablet.merk="Combantrine";
        tablet.jenis="Zat Padat";
        tablet.isi="500 mg";
        tablet.warna="Orange";
        tablet.kemasan="Plastik";
        
        serbuk.merk="Adam Sari";
        serbuk.jenis="Zat Padat kecil";
        serbuk.isi="2,5 gr";
        serbuk.warna="Putih";
        serbuk.kemasan="Alumunium Foil";
        
        
    
}
}
