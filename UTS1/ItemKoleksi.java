package UTS1;

public abstract class ItemKoleksi {
    protected int id;
    protected String judul;
    protected int tahunTerbit;
    protected static int counter;

    public abstract int hitungBiayaPinjam(int lamaPinjam);

    public void printInfo() {
        System.out.println("ID = " + id);
        System.out.println("Judul Buku = " + judul);
        System.out.println("Tahun Terbit = " + tahunTerbit);
    };
}
