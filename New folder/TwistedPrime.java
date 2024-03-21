// Check the given number is twisted prime or not

public class TwistedPrime {
    public static void main(String [] args){
        int ip = 13;
        int rev = reverse(ip);

        if(isPrime(ip) && isPrime(rev)){
            System.out.println("It is a Twisted Prime number");
        }
        else{
            System.out.println("It is not a Twisted Prime number");
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
    public static int reverse(int num)
    {
        int rev = 0;
        while(num!=0)
        {
            rev = rev*10 + (num%10);
            num/=10;
        }
        return rev;
    }
}
