import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang di program penghitung ongkos kirim");
        System.out.println("========================||========================");

        System.out.print("Masukkan panjang barang (cm): ");
        int panjang = input.nextInt();

        System.out.print("Masukkan lebar barang (cm): ");
        int lebar = input.nextInt();

        System.out.print("Masukkan tinggi barang (cm): ");
        int tinggi = input.nextInt();

        System.out.print("Masukkan berat barang (Kg): ");
        double berat = input.nextDouble();

        Harga biaya = new Harga(panjang, lebar, tinggi, berat);


        System.out.println("Biaya pengiriman : Rp."+biaya.hitungBiayaPengiriman());
    }
}