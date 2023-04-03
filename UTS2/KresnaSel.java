package UTS2;

public class KresnaSel {
    private static int saldo;

    public KresnaSel(int s) {
        saldo = s;
        System.out.println("Produk KresnaSel tercipta, saldo = " + saldo + ", silahkan diaktifkan");
    }

    public static int getSaldo() {
        return saldo;
    }

    public static void addSaldo(int nominal) {
        saldo += nominal;
    }

    public static void subtractSaldo(int nominal) {
        saldo -= nominal;
    }
}
