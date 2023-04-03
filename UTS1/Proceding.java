package UTS1;

public class Proceding extends ItemKoleksi {
    private int cetakanKe;

    protected static int counter;

    public Proceding(int id, String judul, int tahunTerbit, int cetakanKe) {
        this.id = id;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        counter++;
    }

    public Proceding(int id, String judul, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = 0;
        counter++;
    }

    @Override
    public int hitungBiayaPinjam(int lamaPinjam) {
        return 5000;
    }

    public void printInfo() {
        System.out.println("PROCEDING");
        super.printInfo();
        System.out.println("Cetakan ke = " + cetakanKe);
    }

    public void setCetakanKe(int n) {
        cetakanKe = n;
    }

    public int getCetakanKe() {
        return cetakanKe;
    }

    public int getCounter() {
        return counter;
    }
}
