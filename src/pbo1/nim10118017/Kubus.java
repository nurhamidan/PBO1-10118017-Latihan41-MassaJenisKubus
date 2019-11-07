package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Berisi atribut dan method untuk menghitung volume dan massa jenis kubus.
 * 
 */
public class Kubus {
    //Atribut Class
    private int sisi;
    private int massa;

    //Getter Setter
    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    //Method tambahan
    public int hitungVolume(int parSisi) {
        return parSisi * parSisi * parSisi;
    }
    
    public int hitungMassaJenis(int parMassa, int volume) {
        return parMassa / volume;
    }
}
