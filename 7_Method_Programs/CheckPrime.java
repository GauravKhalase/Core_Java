// Write a program to check the given number is prime or not

public class CheckPrime {
    public static void main( String [] args){
        int ip = 7;
        if(isPrime(ip)){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("it is not a prime number");
        }
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
