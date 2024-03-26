public class AutomorphicNumber {
    public static void main(String[] args){
        int num = 25;
        int ct = count(num);
        int product = num*num;
        int last = product % power(10,ct);
        if(last == num){
            System.out.println("It is an automorphic number");
        }
        else{
            System.out.println("It is not an automorphic number");
        }
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
