class narrowing
{
	public static void main(String[] args) 
	{
		{
			System.out.println("short-");
			short s = 125;
			
			byte b = (byte) s;		//if s>127 then o/p is random value	
			//char ch = (byte) s;	//error: incompatible types: possible lossy conversion from byte to char

			System.out.println(b);
		}
		System.out.println("");
		{
			System.out.println("char-");
			char ch = 'a';
			
			byte b = (byte) ch;
			short s = (short) ch;

			System.out.println(b);
			System.out.println(s);
		}
		System.out.println("");
		{
			System.out.println("int- ");
			int i = 5234;

			byte b = (byte) i;
			short s = (short) i;
			char ch = (char) i;

			System.out.println(b);
			System.out.println(s);
			System.out.println(ch);
		}
		System.out.println("");
		{
			System.out.println("long- ");
			long l = 5694l;

			byte b = (byte) l;
			short s = (short) l;
			char ch = (char) l;
			int i = (int) l;

			System.out.println(b);
			System.out.println(s);
			System.out.println(ch);
			System.out.println(i);
		}
		System.out.println("");
		{
			System.out.println("float- ");
			float f = 22546.56f;

			byte b = (byte) f;
			short s = (short) f;
			char ch = (char) f;
			int i = (int) f;
			long l = (long) f;

			System.out.println(b);
			System.out.println(s);
			System.out.println(ch);
			System.out.println(i);
			System.out.println(l);
		}
		System.out.println("");
		{
			System.out.println("double- ");
			double d = 458689.965852;

			byte b = (byte) d;
			short s = (short) d;
			char ch = (char) d;
			int i = (int) d;
			long l = (long) d;
			float f = (float) d;

			System.out.println(b);
			System.out.println(s);
			System.out.println(ch);
			System.out.println(i);
			System.out.println(l);
			System.out.println(f);
		}
	}
}
