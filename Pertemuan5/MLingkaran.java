// 25/03/2023
// Nama File   :   MLingkaran.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Program inti dari Lingkaran

package Pertemuan5;

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan jari-jari lingkaran : ");;
        double jejari = scan.nextDouble();
        Lingkaran lingkaran = new Lingkaran(jejari);

        System.out.println("Luas lingkaran dengan jari-jari " + jejari + " adalah " + lingkaran.hitungLuas());

        scan.close();
    }
}
