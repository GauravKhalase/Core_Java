// Largest of four numbers

class ConditionalOperator
{
	public static void main(String[] args) 
	{
		int a = 50;
		int b = 60;
		int c = 40;
		int d = 70;

		int ans = a>b ? (a>c ? (a>d ? a:d):(c>d ? c:d)):(b>c ? (b>d ? b:d):(c>d ? c:d));

		System.out.println("the largest number: "+ ans);
	}
}
