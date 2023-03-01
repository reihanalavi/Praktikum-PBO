// 01/03/2023
// Nama File   :   MOperasiTitik.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Kelas yang berisi program utama Operasi Titik

package Pertemuan2;

public class MOperasiTitik {
    public static void main(String[] args) {
        OperasiTitik op = new OperasiTitik();

        Titik t1 = new Titik(4.0, 4.0);
        System.out.println("Titik 1 : (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        op.refleksiX(t1);
        System.out.println("Titik 1 setelah di refleksi Sumbu X : ("+ t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        t1 = new Titik(4.0, 4.0);
        op.refleksiY(t1);
        System.out.println("Titik 1 setelah di refleksi Sumbu Y : ("+ t1.getAbsis() + ", " + t1.getOrdinat() + ")");

    }
}
