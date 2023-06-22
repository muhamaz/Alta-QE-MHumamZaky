/*
Muhammad Humam Zaky
QE BATCH 11
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //inisialisasi objek scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Program Konversi Nilai Siswa");

        //Membaca sebuah inputan yang bertipe integer
        System.out.print("Masukan nilai : ");
        int studentScore = input.nextInt();

        //Percabangan
        if (studentScore>=80 && studentScore<=100){
            System.out.println("Kamu mendapatkan nilai A");
        }
        if (studentScore>=65 && studentScore<=79){
            System.out.println("Kamu mendapatkan nilai B+");
        }
        if (studentScore>=50 && studentScore<=64){
            System.out.println("Kamu mendapatkan nilai B");
        }
        if (studentScore>=35 && studentScore<=49){
            System.out.println("Kamu mendapatkan nilai C");
        }
        if (studentScore>=0 && studentScore<=34){
            System.out.println("Kamu mendapatkan nilai D");
        }
        if (studentScore<0 || studentScore>=101){
            System.out.println("invalid nilai");
        }

        input.close();
    }
}