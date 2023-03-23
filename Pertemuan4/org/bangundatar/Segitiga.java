// 23/03/2023
// Nama File   :   Segitiga.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Kelas yang berisi atribut dan method dari Segitiga yang mewarisi (inherit) kelas dari Poligon

package Pertemuan4.org.bangundatar;

import Pertemuan4.org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alasSisi, tinggiSisi;

    public Segitiga(double alasSisi, double tinggiSisi, int jumlahSisi) {
        this.alasSisi = alasSisi;
        this.tinggiSisi = tinggiSisi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return alasSisi * tinggiSisi / 2;
    }

    public double getAlasSisi() {
        return alasSisi;
    }

    public double getTinggiSisi() {
        return tinggiSisi;
    }
}
