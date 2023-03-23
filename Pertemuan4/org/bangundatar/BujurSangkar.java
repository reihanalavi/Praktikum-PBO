// 23/03/2023
// Nama File   :   BujurSangkar.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Kelas yang berisi atribut dan method dari BujurSangkar yang mewarisi (inherit) kelas dari Poligon

package Pertemuan4.org.bangundatar;

import Pertemuan4.org.poligon.Poligon;

public class BujurSangkar extends Poligon {
    private double panjangSisi;

    public BujurSangkar(double panjangSisi, int jumlahSisi) {
        this.panjangSisi = panjangSisi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi() {
        return panjangSisi;
    }
}
