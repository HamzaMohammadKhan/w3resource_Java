import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

//1 to 7 number asked if print 3 then show day, like 3 = Wednesday

public class NumberGenerateWeekday {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        GregorianCalendar obj1 = new GregorianCalendar();
        System.out.println("Enter number : ");

        int day = obj1.get(Calendar.DAY_OF_WEEK);

    }
}
