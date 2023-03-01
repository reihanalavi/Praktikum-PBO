// 01/03/2023
// Nama File   :   OperasiTitik.java
// Penulis     :   Ahmad Reihan Alavi
// Deskripsi   :   Kelas yang berisi atribut dan method dari Operasi Titik

package Pertemuan2;

public class OperasiTitik {
    public OperasiTitik() { }

    private Titik refleksiSumbuX(Titik titik) {
        Titik titikResult = new Titik();
        titikResult.setAbsis(titik.getAbsis());
        titikResult.setOrdinat(titik.getOrdinat() * -1);
        return titikResult;
    }

    private Titik refleksiSumbuY(Titik titik) {
        Titik titikResult = new Titik();
        titikResult.setAbsis(titik.getAbsis() * -1);
        titikResult.setOrdinat(titik.getOrdinat());
        return titikResult;
    }

    public Titik refleksiX(Titik titik) {
        return refleksiSumbuX(titik);
    }

    public Titik refleksiY(Titik titik) {
        return refleksiSumbuY(titik);
    }
}
