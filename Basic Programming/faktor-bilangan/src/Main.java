/*
Muhamamd Humam Zaky
QE BATCH 11
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Faktor Bilangan");

        //Inisialisasi object scanner
        Scanner input = new Scanner(System.in);

        //Baca sebuah inputan yang bertipe integer
        System.out.print("Masukan Sebuah Bilangan: ");
        int bilangan = input.nextInt();

        //Deklarasi variabel jumlah faktor dan faktorBilangan untuk menampilkan jumlah faktor dan faktor bilangan yang di input
        int jumlahFaktor = 0;
        ArrayList<Integer> faktorBilangan = new ArrayList<Integer>();

        //Looping untuk menentukan jumlah faktor dari bilangan
        for (int i = 1; i <= bilangan; i++){
            if (bilangan % i == 0){
                jumlahFaktor++;
                faktorBilangan.add(i);
            }

        }

        input.close();

        //Menampilkan hasil atau output
        System.out.print("Faktor-faktor dari " + bilangan + " adalah: ");
        for (int faktor : faktorBilangan) {
            System.out.print(faktor+" ");
        }
        System.out.println();
        System.out.println("Jumlah faktor bilangan adalah "+jumlahFaktor);
    }


}

