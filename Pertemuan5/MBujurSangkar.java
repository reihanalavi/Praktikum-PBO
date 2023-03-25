// 25/03/2023
// Nama File   :   MBujurSangkar.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Program inti dari Bujur Sangkar

package Pertemuan5;

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar : ");;
        double sisi = scan.nextDouble();

        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " adalah " + bs.hitungLuas(sisi));

        scan.close();
    }
}
