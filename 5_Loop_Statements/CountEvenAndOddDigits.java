import java.util.Scanner;

public class CountEvenAndOddDigits {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;
        int zeroCount = 0;

        while(num>0)
        {
            int last = num%10;
            if(last == 0){
                zeroCount++;
            }
            else if(last%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            num = num/10;
        }
        System.out.println("Total even digits in given number: "+evenCount);
        System.out.println("Total odd digits in given number: "+oddCount);
        System.out.println("Total 0's in given number: "+zeroCount);+
    }
}
