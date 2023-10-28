import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num,i,total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        num = input.nextInt();

        for(i=1;i<num; i++) {
            if (num % i == 0) {
                total +=i ;
            }
        }

        if(num == total) {
            System.out.println(num + " is perfect number.");
        } else {
            System.out.println(num + " is not perfect number.");
        }
    }
}