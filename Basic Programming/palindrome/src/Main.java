import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Sebuah Kata : ");
        String kata = input.nextLine();

        if(isPalindrome(kata)){
            System.out.println(kata+" adalah palindrome.");
        }else{
            System.out.println(kata+" bukan palindrome.");
        }
    }

    public static boolean isPalindrome(String kata){
        //menghapus spasi dan mengubah ke huruf kecil
        String kataUtama = kata.replaceAll("\\s+", "").toLowerCase();

        //mendapatkan panjang dari kata yang diinputkan
        int panjang = kataUtama.length();
        //membuat sebuah array bertipe char dengan panjang sama dengan kata yang diinputkan
        char[] karakter = kataUtama.toCharArray();

        //panjang dibagi 2 karena setengah sisanya akan dibandingkan secara berpasangan
        for (int i = 0; i < panjang / 2; i++){
            //membandingkan karakter pertama indeks ke pertama yaitu 0 dengan karakter indeks terakhir
            if(karakter[i] != karakter[panjang -1 -i]){
                //jika terdapat karakter yang tidak sama maka return false dan kata tersebut bukan palindrome
                return false;
            }
        }
        //return true jika karakter yang dibandingkan tidak ada perbedaan, maka input adalah palindrome
        return true;
    }
}