/*
Muhammad Humam Zaky
QE BATCH 11
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inisialisasi objek scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung luas Segitiga");

        //Membaca sebuah inputan yang bertipe float
        System.out.println("Masukan alas : ");
        float alas = input.nextFloat();

        System.out.println("Masukan tinggi : ");
        float tinggi = input.nextFloat();

        //Deklarasi variabel luas untuk menampung nilai luas segitiga
        float luas;

        luas = alas * tinggi/2;

        //menampilkan hasil
        System.out.println("Luas Segitiga adalah "+luas);

        input.close();
    }
}