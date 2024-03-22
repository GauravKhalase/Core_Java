public class RotatingPrimeNumber {
    public static void main(String []args){
        int num = 113;
        int temp = num;
        if(isPrime(num)){
            num = rotate(num);
            while(temp != num){
                if(isPrime(num)){
                    num = rotate(num);
                }
                else{
                    break;
                }
            }
            if(temp == num){
                System.out.println("It is a rotating prime number");
            }
            else{
                System.out.println("It is not a rotating prime number");
            }
        }
        else{
            System.out.println("It is not a prime number");
        }
    }
    public static boolean isPrime(int num){
        int i;
        for(i= 2; i<num;i++){
            if(num%2 == 0){
                break ;
            }
        }
        return i == num;
    }
    public static int rotate(int num){
        int ct = count(num);
        int last = num%10;
        num/=10;

        int ans = last * power(10, ct-1) + num;
        return ans;
    }
    public static int count(int num){
        int ct = 0;
        while(num !=0){
            ct++;
            num/=10;
        }
        return ct;
    }
    public static int power(int base, int count){
        int pow = 1;
        for(int i = count; i>0; i--){
            pow = pow*base;
        }
        return pow;
    }
}
