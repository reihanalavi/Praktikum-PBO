// 01/03/2023
// Nama File   :   MTitik.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Kelas yang berisi program utama Titik

package Pertemuan2;

public class MTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        Titik t3 = new Titik(3, 4);

        t1.setAbsis(1);
        t1.setOrdinat(3);

        t2.setAbsis(2);
        t2.setOrdinat(6);

        System.out.println("Jumlah objek titik : " + Titik.getCounterTitik());
        System.out.println("t1 (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("t2 (" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("t3 (" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
    }
}
