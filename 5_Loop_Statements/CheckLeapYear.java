// Check leap year or not

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();

        if(year<1582)
        {
            System.out.println("Please enter year greater than 1582");   
        }
        else if((year%4 == 0 && year%100 != 0)|| year%400 == 0){
            System.out.println("This is a leap year.");
        }
        else{
            System.out.println("This is not a leap year.");
        }

        sc.close();
    }   
}
