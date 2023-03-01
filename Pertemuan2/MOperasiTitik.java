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

        Titik rX = op.refleksiX(t1);
        System.out.println("Titik 1 setelah di refleksi Sumbu X : ("+ rX.getAbsis() + ", " + rX.getOrdinat() + ")");

        Titik rY = op.refleksiY(t1);
        System.out.println("Titik 1 setelah di refleksi Sumbu Y : ("+ rY.getAbsis() + ", " + rY.getOrdinat() + ")");

    }
}
