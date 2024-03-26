public class TechNumber {
    public static void main(String [] args){
        int num = 2025;
        int ct = count(num);
        int ans;
        if(ct%2 == 0){
            int first  = num / power(10,ct/2);
            int second  = num % power(10,ct/2);
            int add = first + second;
            ans = add*add;
            if(ans == num){
                System.out.println("It is a tech number");
            }
            else{
                System.out.println("It is not a tech number");
            }
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
