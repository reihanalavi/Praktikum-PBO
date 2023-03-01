// 01/03/2023
// Nama File   :   Titik.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Kelas yang berisi atribut dan method dari Titik

package Pertemuan2;

public class Titik {
    private double absis;
    private double ordinat;
    private static double counterTitik;
    
    public Titik() {
        counterTitik = counterTitik++;
    }

    public Titik(double a, double o) {
        absis = a;
        ordinat = o;
        counterTitik = counterTitik+1;
    }

    public void setAbsis(double a) {
        absis = a;
    }

    public void setOrdinat(double o) {
        ordinat = o;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public static double getCounterTitik() {
        return counterTitik;
    }
}