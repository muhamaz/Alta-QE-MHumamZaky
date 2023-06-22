public class Tabung {

    double jari;
    double tinggi;

    public Tabung(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public double volumeTabung(){

        double volume;

        volume = Math.PI * Math.pow(this.jari, 2) * this.tinggi;

        return volume;

    }
}
