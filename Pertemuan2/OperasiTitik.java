// 01/03/2023
// Nama File   :   OperasiTitik.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Kelas yang berisi atribut dan method dari Operasi Titik

package Pertemuan2;

public class OperasiTitik {
    public OperasiTitik() { }

    private void refleksiSumbuX(Titik titik) {
        Double ordinat = titik.getOrdinat();
        titik.setOrdinat(ordinat * -1);
        
    }

    private void refleksiSumbuY(Titik titik) {
        Double absis = titik.getAbsis();
        titik.setAbsis(absis * -1);
    }

    public void refleksiX(Titik titik) {
        refleksiSumbuX(titik);
    }

    public void refleksiY(Titik titik) {
        refleksiSumbuY(titik);
    }
}
