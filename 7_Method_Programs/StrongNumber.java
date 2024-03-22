public class StrongNumber {
    public static void main(String []args){
        int ip = 143;

        if(ip == sumOfFactorials(ip)){
            System.out.println("It is a Strong Number");
        }
        else{
            System.out.println("It is not a Strong Number");
        }
    }
    public static int sumOfFactorials(int num){
        int sum = 0;
        while(num!=0){
            int last = num%10;
            sum = sum + factorial(last);
            num/=10;
        }
        return sum;
    }
    public static int factorial(int num){
        int product = 1;
        for(int i=1; i<=num ; i++){
            product = product*i;
        }
        return product;
    }
}
