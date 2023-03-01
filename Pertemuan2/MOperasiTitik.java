// 01/03/2023
// Nama File   :   MOperasiTitik.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Kelas yang berisi program utama Operasi Titik

package Pertemuan2;

public class MOperasiTitik {
    public static void main(String[] args) {
        OperasiTitik op = new OperasiTitik();
        Titik t1 = new Titik(4.0, 4.0);

        Titik t1RefleksiX = new Titik(0.0, 0.0);
        Titik t1RefleksiY = new Titik(0.0, 0.0);

        t1RefleksiX = op.refleksiX(t1);
        t1RefleksiY = op.refleksiY(t1);

        System.out.println("Titik : (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("Titik setelah di refleksi Sumbu X : ("+ t1RefleksiX.getAbsis() + ", " + t1RefleksiX.getOrdinat() + ")");
        System.out.println("Titik setelah di refleksi Sumbu Y : ("+ t1RefleksiY.getAbsis() + ", " + t1RefleksiY.getOrdinat() + ")");

    }
}
