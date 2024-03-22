class Addition
{
    public static void main(String []args)
    {
        int ans = add(1,2);
        System.out.println("The addition is: "+ ans);
    }
    public static int add(int a, int b)
    {
        int c = a+b;
        return c;
    }
}

// Example using global variable

// class Addition
// {
//     int c;
//     public static void main(String []args)
//     {
//         Addition a=new Addition();
//         System.out.println("The addition is: "+ a.add(1,2));
//     }
//     public int add(int a, int b)
//     {
//         c = a+b;
//         return c;
//     }
// }