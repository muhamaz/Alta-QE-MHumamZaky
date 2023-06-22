public class Harga extends Barang{

    public Harga(int panjang, int lebar, int tinggi, double berat) {
        super(panjang, lebar, tinggi, berat);
    }


    /*setelah dihitung volume beratnya selanjutnya adalah membandingkan antara volume berat dengan berat inputan yang
    dimasukan menggunakan fungsi Math.max akan diambil nilai yang terbesarnya*/
    public double hitungBeratPengiriman(){
        return Math.max(berat, konversiVolumeBerat());
    }

    //selanjutnya adalah penghitungan biaya dari berat yang telah dibandingkan
    public int hitungBiayaPengiriman(){
        //Math.ceil berfungsi untuk membulatkan keatas nilai yang dimasukan
        int biaya = (int) Math.ceil(hitungBeratPengiriman());

        return biaya * 5000;
    }
}
