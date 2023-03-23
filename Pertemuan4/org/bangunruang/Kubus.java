// 23/03/2023
// Nama File   :   Kubus.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Kelas yang berisi atribut dan method dari Kubus yang memiliki bagian dari kelas BujurSangkar

package Pertemuan4.org.bangunruang;

import Pertemuan4.org.bangundatar.BujurSangkar;

public class Kubus {
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar bujurSangkar) {
        this.permukaan = bujurSangkar;
    }

    public double hitungVolume() {
        double sisi = permukaan.getPanjangSisi();
        return sisi * sisi * sisi;
    }

    public double hitungLuasAlas() {
        return permukaan.hitungLuas();
    }
}
