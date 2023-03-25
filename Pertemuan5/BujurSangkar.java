// 25/03/2023
// Nama File   :   BujurSangkar.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Kelas yang berisi method dan atribut dari Bujur Sangkar, yang mewarisi (inherit) kelas dari BangunDatar

package Pertemuan5;

public class BujurSangkar extends BangunDatar {

    @Override
    public double hitungLuas(double sisi) {
        luas = sisi * sisi;
        return luas;
    }
    
}
