// 25/03/2023
// Nama File   :   BangunDatar.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Kelas abstrak yang berisi abstraksi dari Bangun Datar

package Pertemuan5;

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l) {
        luas = l;
    }

    public double getLuas() {
        return luas;
    }
}
