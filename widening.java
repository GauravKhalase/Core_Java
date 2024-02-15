class widening 
{
	public static void main(String[] args) 
	{
		{
			System.out.println("byte-");
			byte b = 10;
			
			short s = b;
			//char c = b;		//CTE
			int i = b;
			long l = b;
			float f = b;
			double d = b;

			System.out.println(s);
			System.out.println(i);
			System.out.println(l);
			System.out.println(f);
			System.out.println(d);
		}
		System.out.println("");
		{
			System.out.println("short-");			
			short s = 1000;

			//char c = s;		//CTE
			int i = s;
			long l = s;
			float f = s;
			double d = s;

			System.out.println(i);
			System.out.println(l);
			System.out.println(f);
			System.out.println(d);
		}	
		System.out.println("");
		{
			System.out.println("int-");			
			int i = 50000;

			long l = i;
			float f = i;
			double d = i;

			System.out.println(l);
			System.out.println(f);
			System.out.println(d);
		}
		System.out.println("");
		{
			System.out.println("long-");			
			long l = 500000l;

			float f = l;
			double d = l;

			System.out.println(f);
			System.out.println(d);
		}
		System.out.println("");
		{
			System.out.println("float-");			
			float f = 50.50f;

			double d = f;

			System.out.println(d);
		}	
	}
}
