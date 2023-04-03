package UTS2;

public class KresnaPay {
    private String name = "";
    private int saldo;
    private String pin = "1234";

    public KresnaPay(String name, int saldo) {
        this.name = name;
        this.saldo = saldo;
        System.out.println("Selamat " + this.name + " member KresnaPay aktif, saldo = " + this.saldo);
    }

    public KresnaPay() {
        System.out.println("Selamat " + this.name + " member KresnaPay aktif, saldo = " + this.saldo);
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pinBaru) {
        this.pin = pinBaru;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getName() {
        return name;
    }

    public void reduceSaldo(int nominal) { 
        saldo -= nominal;
    }

    public void tambahSaldo(int nominal) {
        saldo += nominal;
    }

}
