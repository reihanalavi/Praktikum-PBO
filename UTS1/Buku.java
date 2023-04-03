package UTS1;

public class Buku extends ItemKoleksi {

    private String pengarang;

    public Buku(int id, String judul, int tahunTerbit, String pengarang) {
        this.id = id;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        counter++;
    }

    @Override
    public int hitungBiayaPinjam(int lamaPinjam) {
        return lamaPinjam * 500;
    }

    public void printInfo() {
        System.out.println("BUKU");
        super.printInfo();
        System.out.println("Pengarang = " + pengarang);
    }

    public void setPengarang(String n) {
        pengarang = n;
    }

    public String getPengarang() {
        return pengarang;
    }
    
    public int getCounter() {
        return counter;
    }
    
}
