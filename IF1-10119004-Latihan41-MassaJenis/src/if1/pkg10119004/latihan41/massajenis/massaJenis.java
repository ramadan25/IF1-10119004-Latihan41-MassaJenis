/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan41.massajenis;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Menampilkan perhitungan massa jenis kubus
 */
class massaJenis {
    private static double Volume,MassaJ;
    public static double sisi,massa;
    
     public static double hitungVolume() {
        Volume = sisi * sisi * sisi ;
        return Volume;    
    }
      public static double hitungMassaJ() {
        MassaJ = massa / Volume ;
        return MassaJ;    
    }
    
}
