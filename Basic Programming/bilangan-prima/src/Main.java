import java.util.Scanner;
public class Main {

    public static boolean primeNumber(int number){
        int jmlFaktor = 0;
        boolean isPrime;

        for (int i = 1; i <= number; i++){
            if(number % i == 0){
                jmlFaktor++;
            }
        }

        if(jmlFaktor == 2){
            isPrime = true;
        }else{
            isPrime = false;
        }

        return isPrime;
    }


    public static void main(String[] args) {

        boolean isContinue = true;
        Scanner input = new Scanner(System.in);

        while(isContinue){
            System.out.print("Masukan Sebuah Bilangan : ");
            int bilangan = input.nextInt();
            input.nextLine();

            primeNumber(bilangan);

            if (primeNumber(bilangan)){
                System.out.println("Bilangan Prima");
            }else {
                System.out.println("Bukan Bilangan Prima");
            }

            System.out.println("Exit?? (Y/N): ");
            String statement = input.nextLine().toUpperCase();

            if (statement.equals("Y")){
                System.out.println("Bye-Bye...");
                isContinue = false;
            }else if(statement.equals("N")){
                isContinue = true;
            }else {
                System.out.println("input invalid, program akan berhenti!!!");
                System.out.println("");
                isContinue = false;
            }
        }

        input.close();

    }
}