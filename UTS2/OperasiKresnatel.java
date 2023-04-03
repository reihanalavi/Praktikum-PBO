package UTS2;

public class OperasiKresnatel {
    KresnaPay kPay;

    public OperasiKresnatel(KresnaPay kPay) {
        this.kPay = kPay;
    }

    public static void setActiveKresnatel(KresnaSel kSel) {
        System.out.println("KresnaSel aktif, saldo = " + kSel.getSaldo() + ", Terima kasih");
    }

    public static void cekSaldoKresnasel() {
        System.out.println("Saldo deposit KresnaSel saat ini = " + KresnaSel.getSaldo());
    }

    public static void topUpKresnasel(int nominal) {
        KresnaSel.addSaldo(nominal);
        System.out.println("Top Up KresnaSel berhasil, saldo = " + KresnaSel.getSaldo() + ", terima kasih.");
    }

    public static void subtractKresnasel(int nominal) {
        KresnaSel.subtractSaldo(nominal);
    }

    public void gantiPinKresnaPay(String pinLama, String pinBaru) {
        if(kPay.getPin() == pinLama) {
            kPay.setPin(pinBaru);
            System.out.println("Sukses, PIN " + kPay.getName() + " sudah berubah.");
        } else {
            System.out.println("Maaf, PIN lama " + kPay.getName() + " salah.");
        }
    }

    public void cekSaldoKresnaPay() {
        System.out.println("Saldo KresnaPay " + kPay.getName() + " saat ini = " + kPay.getSaldo());
    }

    public void topUpKresnaPay(int nominal) {
        kPay.tambahSaldo(nominal);
        System.out.println("Top up KresnaPay " + kPay.getName() + " berhasil, saldo = " + kPay.getSaldo() + ", terimakasih");
    }

    public void isiPulsa(String nomorTujuan, int nominal, String pin) {
        if(kPay.getPin() == pin) {
            if(kPay.getSaldo() >= nominal) {

                kPay.reduceSaldo(nominal);
                subtractKresnasel(nominal);
                System.out.println("Pengisian pulsa oleh " + kPay.getName() + " ke " + nomorTujuan + " sebesar " + nominal + " berhasil ");
                System.out.println("Sisa saldo KresnaPay " + kPay.getName() + " = " + kPay.getSaldo() + ", terimakasih");
            } else {
                System.out.println("Maaf saldo KresnaPay " + kPay.getName() + " tidak mencukupi");
            }
        } else {
            System.out.println("Maaf, PIN lama " + kPay.getName() + " salah. Isi pulsa gagal");
        }
    }
    
}
