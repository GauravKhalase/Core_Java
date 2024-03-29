public class HappyAndSadNumber {
    public static void main(String[] args){
        int start = 1;
        int end = 1000;
        
        while(start<=end){
            if(isHappy(start)){
                System.out.println(start);
            }
            
            start++;
        }
    }
    public static boolean isHappy(int ip){

        while(true){
            ip = sumSqDigit(ip);
            if(ip == 4 || ip ==1){
                break;
            }
        }
        return ip == 1;
    }
    public static int sumSqDigit(int num){
        int sum = 0;

        while(num!=0){
            int last = num%10;
            sum = sum + (last*last);
            num/=10;
        }
        return sum;
    }
}
