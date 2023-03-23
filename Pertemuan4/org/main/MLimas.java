// 23/03/2023
// Nama File   :   MLimas.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Program inti dari kelas Limas Segitiga

package Pertemuan4.org.main;

import Pertemuan4.org.bangundatar.Segitiga;
import Pertemuan4.org.bangunruang.LimasSegitiga;

public class MLimas {
    public static void main(String[] args) {
        LimasSegitiga limasSegitiga;
        Segitiga segitiga;

        segitiga = new Segitiga(5, 7, 3);
        limasSegitiga = new LimasSegitiga(segitiga);

        System.out.println("Volume dari Limas Segitiga adalah : " + limasSegitiga.hitungVolume());
        System.out.println("Luas Alas dari Limas Segitiga adalah : " + limasSegitiga.hitungLuasAlas());
    }
}
