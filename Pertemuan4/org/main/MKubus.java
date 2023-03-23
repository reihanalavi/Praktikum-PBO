// 23/03/2023
// Nama File   :   MKubus.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Program inti dari kelas Kubus

package Pertemuan4.org.main;

import Pertemuan4.org.bangundatar.BujurSangkar;
import Pertemuan4.org.bangunruang.Kubus;

public class MKubus {
    public static void main(String[] args) {
        Kubus kubus;
        BujurSangkar bujurSangkar;

        bujurSangkar = new BujurSangkar(4.5, 4);
        kubus = new Kubus(bujurSangkar);

        System.out.println("Volume dari Kubus adalah : " + kubus.hitungVolume());
        System.out.println("Luas Alas dari Kubus adalah : " + kubus.hitungLuasAlas());
    }
}
