package UTS1;

public class MKoleksi {
    public static void main(String[] args) {
        Buku b;
        Majalah m;
        Proceding p;
        Proceding p2;

        b = new Buku(1, "PBO", 2015, "Latanza");
        m = new Majalah(1, "IF", 2015, 4);
        p = new Proceding(1, "SNIK", 2015, 1);
        p2 = new Proceding(2, "SOA", 2015);

        m.hitungBiayaPinjam(7);
        b.printInfo();

        m.getCounter();

        p.setCetakanKe(2);
        p2.setCetakanKe(1);

        // b.pengarang; -> Error
    }
}
