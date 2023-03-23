// 23/03/2023
// Nama File   :   LimasSegitiga.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Kelas yang berisi atribut dan method dari LimasSegitiga yang memiliki bagian dari kelas Segitiga

package Pertemuan4.org.bangunruang;

import Pertemuan4.org.bangundatar.Segitiga;

public class LimasSegitiga {
    private Segitiga permukaan;

    public LimasSegitiga(Segitiga segitiga) {
        this.permukaan = segitiga;
    }

    public double hitungVolume() {
        double alas = permukaan.getAlasSisi();
        double tinggi = permukaan.getTinggiSisi();
        return alas * tinggi / 2 * 4;
    }

    public double hitungLuasAlas() {
        return permukaan.hitungLuas();
    }
}
