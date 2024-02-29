import java.util.Scanner;
 
class Input1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of byte datatype:");
		byte b = sc.nextByte();

		System.out.println("Enter the number of short datatype:");
		short s = sc.nextShort();

		System.out.println("Enter the number of int datatype:");
		int i = sc.nextInt();

		System.out.println("Enter the number of long datatype:");
		long l = sc.nextLong();

		System.out.println("Enter the number of char datatype:");
		char ch = sc.next().charAt(0);

		System.out.println("Enter the number of float datatype:");
		float f = sc.nextFloat();

		System.out.println("Enter the number of double datatype:");
		double d = sc.nextDouble();

		System.out.println("Enter the boolean value:");
		boolean bool = sc.nextBoolean();

		System.out.println("Enter the word:");
		String word = sc.next();

		System.out.println("Enter the sentence:");
		String sentence = sc.nextLine();

		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("ch = " + ch);
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("bool = " + bool);
		System.out.println("word = " + word);
		System.out.println("sentence = " + sentence);
	}
}
