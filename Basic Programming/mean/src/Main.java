import java.util.Scanner;

public class Main {

    public static float Mean(float[] numbers){

        int panjangArray = numbers.length;
        float sum = 0;

        for (int i = 0; i < panjangArray; i++){
            sum += numbers[i];
        }
        float result = sum/panjangArray;

        return result;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Panjang Array : ");
        int panjangArray = input.nextInt();

        float[] array = new float[panjangArray];

        System.out.println("");

        System.out.println("Masukan elemen-elemen Array: ");

        for (int i = 0; i < panjangArray; i++){
            System.out.print("Elemen array ke "+(i+1)+": ");
            array[i] = input.nextFloat();
        }

        System.out.println("Array yang dimasukan: ");

        for (int i = 0; i < panjangArray; i++){
            System.out.print(array[i] + ", ");
        }

        System.out.println("");

        System.out.print("Rata-rata dari array : ");
        System.out.println(Mean(array));

    }
}