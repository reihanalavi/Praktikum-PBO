package Pertemuan6;

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if(angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException e) {
            System.out.println(e.getMessage());
            System.out.println("Hati-hati memasukkan angka");
        }
    }
}
