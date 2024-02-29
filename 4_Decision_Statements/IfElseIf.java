import java.util.Scanner;
class IfElseIf
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks");
		double marks = sc.nextDouble();

		if(marks>=0 && marks<35)
		{
			System.out.println("Failed! ");
		}
		else if(marks==35)
		{
			System.out.println("You are just pass ");
		}
		else if(marks>35 && marks<=60)
		{
			System.out.println("Second Class!");
		}
		else if(marks>60 && marks<=75)
		{
			System.out.println("First Class!");
		}
		else if(marks>75 && marks<=90)
		{
			System.out.println("First Class With Distinction ");
		}
		else if (marks>90 && marks<=100)
		{
			System.out.println("Distinction! Don't tell your neighbours");
		}
		else
		{
			System.out.println("Are you from this planet ?");
		}
	}
}
