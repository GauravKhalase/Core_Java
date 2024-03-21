// check the given nunber is palindromic even number or not

public class CheckPalindromicEven {
    public static void main(String[] args)
    {
        int ip = 242;
        int rev = reverse(ip);

        if(isPalindrome(ip, rev) && isEven(ip))
        {
            System.out.println("The given number is palindromic even number");
        }
        else
        {
            System.out.println("The given number is not a palindromic even number");
        }

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
    public static boolean isPalindrome(int ip, int num)
    {
        return ip == num;
    }
    public static boolean isEven(int ip)
    {
        return ip%2 == 0;
    }
}
