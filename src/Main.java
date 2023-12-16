import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables defined.
        int num,i,total = 0;

        //New scanner created.
        Scanner input = new Scanner(System.in);

        //Data retrieved from user.
        System.out.print("Enter Number: ");
        num = input.nextInt();

        //Perfect number calculated.
        for(i=1;i<num; i++) {
            if (num % i == 0) {
                total +=i ;
            }
        }

        //Result printed.
        if(num == total) {
            System.out.println(num + " is perfect number.");
        } else {
            System.out.println(num + " is not perfect number.");
        }
    }
}