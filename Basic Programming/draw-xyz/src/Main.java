/*
Muhammad Humam Zaky
QE Batch 11
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void DrawXYZ(int n){

        //Deklarasi Variable dan arraylist
        int m = n*n;
        ArrayList<String> simbol = new ArrayList<String>();

        //cek kondisi dengan looping kemudian hasil akan dimasukan kedalam arraylist
        for (int j = 1; j <= m; j++) {
            //jika kelipatan 3 maka akan ditambahkan X kedalam arraylist
            if (j % 3 == 0) {
                simbol.add("X ");
            }
            //jika kelipatan ganjil maka akan ditambahkan Y kedalam arraylist
            else if (j % 2 == 1) {
                simbol.add("Y ");
            }
            //jika kelipatan genap maka akan ditambahkan Z kedalam arraylist
            else if (j % 2 == 0) {
                simbol.add("Z ");
            }
        }

        //inisialisasi l untuk akses elemen arraylist
        int l = 0;

        //menampilkan arraylist menggunakan looping for
        for(int i = 1; i <= n; i++){
            for (int k = 1; k <= n; k++){
                String elemen = simbol.get(l);
                System.out.print(elemen);
                ++l;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        boolean isContinue = true;

        Scanner input = new Scanner(System.in);

        while(isContinue){
            System.out.println("Program Menggambar pola dari Simbol XYZ");

            System.out.print("Masukan nilai (n x n) : ");
            int n = input.nextInt();
            input.nextLine();

            DrawXYZ(n);

            System.out.println("");

            System.out.print("Exit?? (Y/N): ");
            String stat = input.nextLine().toUpperCase();


            if (stat.equals("Y")){
                System.out.println("Bye-Bye...");
                isContinue = false;
            }else if(stat.equals("N")){
                isContinue = true;
            }else{
                System.out.println("input invalid, program akan berhenti.");
                System.out.println("");
                isContinue = false;
            }
        }


        input.close();
    }
}