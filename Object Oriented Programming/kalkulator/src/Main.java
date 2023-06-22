import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] menu = {"Penjumlahan", "Pengurangan", "Perkalian", "Pembagian", "keluar"};
        boolean isContinue = true;

        while (isContinue){
            System.out.println("");
            System.out.println("Program Kalkulator Sederhana");
            System.out.println("");
            for (int i = 0; i < menu.length; i++){
                System.out.println((i+1)+". "+menu[i]);
            }

            System.out.print("Masukan Pilihan: ");
            int pilihan = input.nextInt();

            if(pilihan == 1){

                var jumlah = new Penjumlahan();

                System.out.println("Penjumlahan dua bilangan a + b");
                System.out.println("");

                System.out.print("Masukan nilai a : ");
                double a = input.nextDouble();
                jumlah.setAngka1(a);
                System.out.print("Masukan nilai b : ");
                double b = input.nextDouble();
                jumlah.setAngka2(b);
                System.out.println("");

                System.out.print("Hasil Penjumlahan a + b adalah ");
                System.out.println(jumlah.hitungJumlah());

            } else if (pilihan == 2) {

                var kurang = new Pengurangan();

                System.out.println("Pengurangan dua bilangan a - b");
                System.out.println("");

                System.out.print("Masukan nilai a : ");
                double a = input.nextDouble();
                kurang.setAngka1(a);
                System.out.print("Masukan nilai b : ");
                double b = input.nextDouble();
                kurang.setAngka2(b);
                System.out.println("");

                System.out.print("Hasil Pengurangan a - b adalah ");
                System.out.println(kurang.hitungKurang());
            } else if (pilihan == 3) {

                var kali = new Perkalian();

                System.out.println("Perkalian dua bilangan a * b");
                System.out.println("");

                System.out.print("Masukan nilai a : ");
                double a = input.nextDouble();
                kali.setAngka1(a);
                System.out.print("Masukan nilai b : ");
                double b = input.nextDouble();
                kali.setAngka2(b);
                System.out.println("");

                System.out.print("Hasil Perkalian a * b adalah ");
                System.out.println(kali.hitungKali());
            } else if (pilihan == 4) {

                var bagi = new Pembagian();

                System.out.println("Pembagian dua bilangan a / b");
                System.out.println("");

                System.out.print("Masukan nilai a : ");
                double a = input.nextDouble();
                bagi.setAngka1(a);
                System.out.print("Masukan nilai b : ");
                double b = input.nextDouble();
                bagi.setAngka2(b);
                System.out.println("");

                System.out.print("Hasil Pembagian a / b adalah ");
                System.out.println(bagi.hitungBagi());
            } else if (pilihan == 5) {
                System.out.println("Bye-Bye....");
                isContinue = false;
            }else {
                System.out.println("Input tidak valid!!!");
                isContinue = false;
            }
        }


    }
}