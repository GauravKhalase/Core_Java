public class RotateNumber {
    public static void main(String [] args){
        System.out.println(rotate(1234));
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
