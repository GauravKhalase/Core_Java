// Find the sum of squares of the digits of a given number 

public class SumOfSquaresOfDigit {
    public static void main(String [] args){
        int num = 123;
        int sum = 0;

        while (num != 0){
            int last = num%10;

            sum = sum + (last*last);

            num/=10;
        }
    
        System.out.println("The sum is:" + sum);
    }
}
