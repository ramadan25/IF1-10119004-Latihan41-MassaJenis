/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan41.massajenis;
import java.util.Scanner;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Menampilkan perhitungan massa jenis kubus
 */
public class IF110119004Latihan41MassaJenis {
        private static double sisi,massa;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        massaJenis kubus = new massaJenis();
        
        System.out.println("=====Massa Jenis Kubus=====");
        System.out.print("Sisi : ");
        kubus.sisi = Double.parseDouble(scanner.next());
        System.out.print("Massa : ");
        kubus.massa = Double.parseDouble(scanner.next());
    
        double Volume = kubus.hitungVolume();
        double MassaJ = kubus.hitungMassaJ();
        System.out.println();
        System.out.println("======Hasil Perhitungan======");
        System.out.printf("Volume\t\t= %.2f%n", Volume);
        System.out.printf("Massa Jenis\t\t\t= %.2f%n", MassaJ);
    }
}
