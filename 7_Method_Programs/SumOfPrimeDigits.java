// Find the sum of prime digits of a given number

public class SumOfPrimeDigits {
    public static void main(String [] args){
        int ip = 2366;
        int sum = Sum(ip);

        System.out.println("The sum of prime digits of a number is: " + sum);
    }
    public static int Sum(int num){
        int sum = 0;
        while(num>0)
        {
            int last = num % 10;

            if(isPrime(last)){
                sum = sum + last;
            }
            num/=10;
        }
        return sum;
    }
    public static boolean isPrime(int num)
    {
        int i;
        for(i=2; i<num; i++)
        {
            if(num%i == 0){
                break;
            }
        }
        return num == i;
    }
}
