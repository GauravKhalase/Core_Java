import java.util.Scanner;

class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select what's you want to do:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");

		int ip = sc.nextInt();

		System.out.println("Enter the first number:");
		double firstNumber = sc.nextInt();
		System.out.println("Enter the second number:");
		double secondNumber = sc.nextInt();

		switch (ip)
		{
			case 1:
			{
				System.out.println("The addition is:" + (firstNumber + secondNumber));
				break;
			}
			case 2:
			{
				System.out.println("The subtraction is:" + (firstNumber - secondNumber));
				break;
			}
			case 3:
			{
				System.out.println("The multiplication is:" + (firstNumber * secondNumber));	
				break;
			}
			case 4:
			{
				double division = firstNumber / secondNumber;
				System.out.println("The division is:" + division);	
				break;
			}
			default:
			{
				System.out.println("You have Entered a wrong number.");
			}
		}
	}
}
