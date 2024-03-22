public class Armstrong {
    public static void main(String [] args){
        System.out.println(isArmstrong(153));
    }
    public static boolean isArmstrong(int num){
        int ct = count(num);
        int sum = 0;
        for(int i= num; i>0; i/=10){
            int rem = i%10;
            sum = sum + power(rem, ct);
        }
        return sum == num ;
    }
    public static int count(int num){
        int count = 0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }
    public static int power(int rem, int count){
        int power = 1;
        for(int i = count;i>0;i--){
            power = power*rem;
        }
        return power;
    }
}
