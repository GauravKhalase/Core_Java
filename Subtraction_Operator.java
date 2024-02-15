class Addition_Operator
{
	public static void main(String[] args) 
	{
		{
			byte a = 10;
			byte b = 5;
			int c = a - b;
			System.out.println(c);
		}
		{
			short a = 10;
			short b = 5;
			int c = a - b;
			System.out.println(c);
		}
		{
			int a = 10;
			int b = 5;
			int c = a - b;
			System.out.println(c);
		}
		{
			long a = 10l;
			long b = 5l;
			long c = a - b;
			System.out.println(c);
		}
		{
			char a = 'a';
			char b = 'b';
			int c = a - b;
			System.out.println(c);
		}
		{
			float a = 10.5f;
			float b = 5.5f;
			float c = a - b;
			System.out.println(c);
		}
		{
			double a = 10.5;
			double b = 5.5;
			double c = a - b;
			System.out.println(c);
		}
		/*{
			boolean a = true;
			boolean b = true;
			boolean c = a - b;		//CTE Compiled Time Error
			System.out.println(c);
		}*/	
	}
}
