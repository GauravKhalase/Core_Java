import java.util.Scanner;

public class DuckNumberProgram {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int zeroCount = 0;

        while(num>0)
        {
            int last = num%10;
            if(last == 0){
                zeroCount++;
            }
            num = num/10;
        }
        if(zeroCount > 0){
            System.out.println("It is a duck number");
        }
        else{
            System.out.println("It is not a duck number");
        }
    }
}
