package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Menampilkan hasil perhitungan kubus mulai dari input user kemudian menghitung volume dan massa jenisnya.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instansiasi objek
        Scanner scanner = new Scanner(System.in);
        Kubus kubus = new Kubus();
        
        //Input data
        System.out.println("======Massa Jenis Kubus======");
        System.out.print("Sisi : ");
        kubus.setSisi(scanner.nextInt());
        System.out.print("Massa : ");
        kubus.setMassa(scanner.nextInt());
        
        //Menampilkan hasil
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : " + kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis : " + kubus.hitungMassaJenis(kubus.getMassa(), kubus.hitungVolume(kubus.getSisi())));
        
        
    }
    
}
