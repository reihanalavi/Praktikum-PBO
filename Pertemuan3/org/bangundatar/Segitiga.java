// 23/03/2023
// Nama File   :   Segitiga.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Kelas yang berisi atribut dan method dari Segitiga yang mewarisi (inherit) kelas dari Poligon

package Pertemuan3.org.bangundatar;

import Pertemuan3.org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return alas * tinggi / 2;
    }

    public void PrintInfo() {
        System.out.println("Segitiga memiliki jumlah sisi : " + this.getJumlahSisi());
    }
}
