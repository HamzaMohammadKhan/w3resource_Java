import java.util.Scanner;

public class Greatest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number : ");
        System.out.println("Enter 2nd number : ");
        System.out.println("Enter 3rd number : ");

        int number1, number2, number3;

        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();

            if(number1 > number2)
            if ( number1 > number3)
            System.out.println("Number 1st is Greatest");

            if(number2 > number3)
            if( number2 >  number1)
                System.out.println("Number 2nd is Greatest");

            if(number3 > number1)
            if( number3 > number2)
                System.out.println("Number 3 is greatest");
            }
        }
