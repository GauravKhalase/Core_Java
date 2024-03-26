public class UniqueNumber {
    public static void main(String[] args){
        int num = 123345;
        int ct = 0;
        while(num!=0){
            int last = num % 10;
            num/=10;
            int temp = num;
            while(temp!=0){
                int end = temp %10;
                temp/=10; 
                if(last == end){ 
                    ct++;
                }
            }
        }
        if(ct == 0){
            System.out.println("It is a unique number");
        }
        else{
            System.out.println("It is not a unique number");
        }
    }
}
