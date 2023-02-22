public class Titik {

    double absis;
    double ordinat;
    static double counterTitik;


    void setAbsis(double a) {
        absis = a;
    }

    void setOrdinat(double o) {
        ordinat = o;
    }

    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    static double getCounterTitik() {
        return counterTitik;
    }

    public static void main(String[] args) {
        Titik t1 = new Titik();
        Titik t2 = new Titik();

        t1.setAbsis(1);
        t1.setOrdinat(3);

        t2.setAbsis(2);
        t2.setOrdinat(6);

        System.out.println("Absis 1 = " + t1.getAbsis());
        System.out.println("Ordinat 1 = " + t1.getOrdinat());
    }
}
