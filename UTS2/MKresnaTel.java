package UTS2;

public class MKresnaTel {
    public static void main(String[] args) {
        KresnaSel kSel = new KresnaSel(1000000);

        OperasiKresnatel.setActiveKresnatel(kSel);

        KresnaPay adi = new KresnaPay("adi", 300000);
        KresnaPay budi = new KresnaPay();

        OperasiKresnatel op1 = new OperasiKresnatel(adi);
        OperasiKresnatel op2 = new OperasiKresnatel(budi);

        op1.isiPulsa("085865187207", 100000, "1234");

        op2.topUpKresnaPay(500000);

        op1.gantiPinKresnaPay("123", "3333");
        op1.gantiPinKresnaPay("1234", "3333");

        op2.cekSaldoKresnaPay();

        op1.isiPulsa("081111111111", 150000, "333");
        op1.isiPulsa("081111111111", 300000, "3333");

        OperasiKresnatel.cekSaldoKresnasel();
        OperasiKresnatel.topUpKresnasel(90000000);
        
    }
}
