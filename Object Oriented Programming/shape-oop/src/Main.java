/*
Muhammad Humam Zaky
QE Batch 11
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean isContinue = true;


        String[] array = {"Segitiga", "Persegi", "Persegi Panjang", "Keluar"};

        while(isContinue){
            System.out.println("Program Menghitung Luas dan Keliling Bangun Datar");

            for (int i = 0; i < array.length; i++){
                System.out.println((i+1)+". "+array[i]);
            }

            System.out.printf("Masukan Pilihan : ");
            int pilihan = input.nextInt();

            if (pilihan == 1){

                System.out.println("Program luas dan keliling Segitiga");
                System.out.println("1. Luas");
                System.out.println("2. Keliling");

                System.out.printf("Masukan Pilihan : ");
                int subpilihan = input.nextInt();
                input.nextLine();

                if (subpilihan == 1){

                    var segitiga = new Segitiga();

                    System.out.println("Luas Segitiga");
                    System.out.println("");
                    System.out.print("Masukan alas : ");
                    float alas = input.nextFloat();
                    segitiga.alas=alas;
                    System.out.print("Masukan tinggi : ");
                    float tinggi = input.nextFloat();
                    segitiga.tinggi=tinggi;
                    System.out.println("");



                    System.out.print("Luas Segitiga adalah ");
                    System.out.println(segitiga.hitungLuas());
                    System.out.println("");

                }else if (subpilihan == 2){

                    var segitiga = new Segitiga();

                    System.out.println("Keliling Segitiga");
                    System.out.println("");

                    System.out.print("Masukan Sisi 1 : ");
                    float sisi1 = input.nextFloat();
                    segitiga.sisi1=sisi1;
                    System.out.print("Masukan Sisi 2 : ");
                    float sisi2 = input.nextFloat();
                    segitiga.sisi2=sisi2;
                    System.out.print("Masukan Sisi 3 : ");
                    float sisi3 = input.nextFloat();
                    segitiga.sisi3=sisi3;

                    System.out.print("Keliling Segitiga adalah ");
                    System.out.println(segitiga.hitungKeliling());
                    System.out.println("");
                }else {
                    System.out.println("Invalid input!!!");
                    isContinue = false;
                }
            } else if (pilihan == 2) {
                System.out.println("Program luas dan keliling Persegi");
                System.out.println("1. Luas");
                System.out.println("2. Keliling");

                System.out.printf("Masukan Pilihan : ");
                int subpilihan = input.nextInt();

                if (subpilihan == 1){
                    System.out.println("Luas Persegi");

                    System.out.print("Masukan sisi : ");
                    float sisi = input.nextFloat();
                    System.out.println("");

                    var persegi = new Persegi(sisi);

                    System.out.print("Luas Persegi adalah ");
                    System.out.println(persegi.hitungLuas());
                } else if (subpilihan == 2) {
                    System.out.println("Keliling Persegi");

                    System.out.print("Masukan sisi : ");
                    float sisi = input.nextFloat();

                    var persegi = new Persegi(sisi);

                    System.out.println("");
                    System.out.print("Keliling Persegi adalah ");
                    System.out.println(persegi.hitungKeliling());
                    System.out.println("");
                }else {
                    System.out.println("Invalid input!!!");
                    isContinue = false;
                }
            } else if (pilihan == 3) {
                System.out.println("Program Luas dan Keliling Persegi Panjang");
                System.out.println("1. Luas");
                System.out.println("2. Keliling");

                System.out.printf("Masukan Pilihan : ");
                int subpilihan = input.nextInt();

                if(subpilihan == 1){
                    System.out.println("Luas Persegi Panjang");

                    System.out.print("Masukan panjang : ");
                    float panjang = input.nextFloat();
                    System.out.print("Masukan lebar : ");
                    float lebar = input.nextFloat();

                    var persegiPanjang = new PersegiPanjang(panjang, lebar);

                    System.out.println("");
                    System.out.print("Luas Persegi Panjang adalah ");
                    System.out.println(persegiPanjang.hitungLuas());

                } else if (subpilihan == 2) {
                    System.out.println("Keliling Persegi Panjang");

                    System.out.print("Masukan panjang : ");
                    float panjang = input.nextFloat();
                    System.out.print("Masukan lebar : ");
                    float lebar = input.nextFloat();

                    var persegiPanjang = new PersegiPanjang(panjang, lebar);

                    System.out.println("");
                    System.out.print("Keliling Persegi Panjang adalah ");
                    System.out.println(persegiPanjang.hitungKeliling());
                }else {
                    System.out.println("Invalid input!!!");
                    isContinue = false;
                }
            }else if (pilihan == 4){
                System.out.println("Bye-Bye...");
                isContinue = false;
            }else {
                System.out.println("Invalid input!!!");
                isContinue = false;
            }
        }

    }
}