import java.util.Scanner;
public class PositiveorNegative {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number is : ");

            int number;
            number = sc.nextInt();

            if(number > 0){
                System.out.println("Number is positive");
            }else if(number < 0) {
                System.out.println("Number is Negative");
            }
        }
}
