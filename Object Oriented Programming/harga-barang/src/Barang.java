public class Barang{

    int panjang;
    int lebar;
    int tinggi;
    double berat;

    public Barang(int panjang, int lebar, int tinggi, double berat) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    //Menghitung volume atau dimensi barang
    public int hitungVolumeBarang() {
        int result;

        result = panjang*lebar*tinggi;

        return result;
    }

    //setelah dihitung volume atau dimensi barang selanjutnya adalah menghitung berat dari volume tersebut
    public double konversiVolumeBerat(){
        int dimensi = hitungVolumeBarang();

        return Math.ceil((double) dimensi / 5000);
    }
}
