package UTS1;

public class Majalah extends ItemKoleksi {
    private int bulanTerbit;

    public Majalah(int id, String judul, int tahunTerbit, int bulanTerbit) {
        this.id = id;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.bulanTerbit = bulanTerbit;
        counter++;
    }

    @Override
    public int hitungBiayaPinjam(int lamaPinjam) {
        return lamaPinjam * 1500 * (1 + (1 / tahunTerbit));
    }
    
    public void printInfo() {
        System.out.println("MAJALAH");
        super.printInfo();
        System.out.println("Bulan Terbit = " + bulanTerbit);
    }

    public void setBulanTerbit(int n) {
        bulanTerbit = n;
    }

    public int getBulanTerbit() {
        return bulanTerbit;
    }

    public int getCounter() {
        return counter;
    }
}
