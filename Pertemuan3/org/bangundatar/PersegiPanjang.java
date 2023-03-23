// 23/03/2023
// Nama File   :   PersegiPanjang.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Kelas yang berisi atribut dan method dari PersegiPanjang yang mewarisi (inherit) kelas dari Poligon

package Pertemuan3.org.bangundatar;

import Pertemuan3.org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public void PrintInfo() {
        System.out.println("Persegi panjang memiliki jumlah sisi : " + this.getJumlahSisi());
    }
    
}
