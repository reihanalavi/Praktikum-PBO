// 23/03/2023
// Nama File   :   Poligon.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Program inti dari kelas Poligon

package Pertemuan3.org.main;

import Pertemuan3.org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {

        // Program Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 6, 4);
        persegiPanjang.PrintInfo();

        System.out.println("Luas Persegi Panjang adalah : " + persegiPanjang.hitungLuas());

        // Program Segitiga
        Segitiga segitiga = new Segitiga(12, 13, 3);
        segitiga.PrintInfo();

        System.out.println("Luas Segitiga adalah : " + segitiga.hitungLuas());
    }
}
