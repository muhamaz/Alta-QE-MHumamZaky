/*
Muhammad Humam Zaky
QE Batch 11
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean isContinue = true;

        String[] array = {"Kubus", "Balok", "Tabung", "Keluar"};

        while(isContinue){
            System.out.println("Program Menghitung Volume Bangun Ruang");

            for (int i = 0; i < array.length; i++){
                System.out.println((i+1)+". "+array[i]);
            }

            System.out.printf("Masukan Pilihan : ");
            int pilihan = input.nextInt();

            if(pilihan == 1){
                System.out.println("Menghitung Volume Kubus");
                System.out.println("");
                System.out.print("Masukan Sisi: ");
                float sisi = input.nextFloat();
                System.out.println("");

                var kubus = new Kubus(sisi);

                System.out.print("Volume Kubus adalah ");
                System.out.println(kubus.volumeKubus());
            } else if (pilihan == 2) {
                System.out.println("Menghitung Volume Balok");
                System.out.println("");
                System.out.print("Masukan Panjang: ");
                float panjang = input.nextFloat();
                System.out.print("Masukan Lebar: ");
                float lebar = input.nextFloat();
                System.out.print("Masukan Tinggi: ");
                float tinggi = input.nextFloat();
                System.out.println("");

                var balok = new Balok(panjang, lebar, tinggi);

                System.out.print("Volume Balok adalah ");
                System.out.println(balok.volumeBalok());
            }else if (pilihan == 3){
                System.out.println("Menghitung Volume Tabung");
                System.out.println("");
                System.out.print("Masukan jari-jari : ");
                double r = input.nextDouble();
                System.out.print("Masukan Tinggi: ");
                double t = input.nextDouble();
                System.out.println("");

                var tabung = new Tabung(r, t);

                System.out.print("Volume Tabung adalah ");
                System.out.println(tabung.volumeTabung());
            } else if (pilihan == 4) {
                System.out.println("Bye-Bye....");
                isContinue = false;
            } else {
                System.out.println("Invalid input!!!");
                isContinue= false;
            }
        }

        input.close();
    }
}