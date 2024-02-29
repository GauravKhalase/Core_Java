class RelationalOperator
{
	public static void main(String[] args) 
	{
		System.out.println(3<4);
		System.out.println('a'>'A');
		System.out.println(0.0>0);
		System.out.println('q'<=113);
		//System.out.println(true>false);
		System.out.println(59.9999==60);
		System.out.println(true==false);
		//System.out.println(true>false);
		System.out.println(true!=false);
		//System.out.println(byte<short);
		//System.out.println(true==1);
		//System.out.println("Hello"<"Hi");
		System.out.println("hi"!="bye");
		System.out.println("Hii"=="hii");
		System.out.println(1.1f<1.1);
		System.out.println((22.0/0.7)>(22.0f/7.0f));

		System.out.println(10 == 10.0);				//true
		System.out.println(true == true);			//true
		System.out.println(0.1 + 0.2 == 0.3);		//false
		System.out.println("abc" == "abc");			//true
		System.out.println(1000 == 1000);			//true
		System.out.println(5 < 10);					//true
		System.out.println(5 >= 5);					//true
		System.out.println("cat" != "dog");			//true
		System.out.println(20 > 10 || 5 < 2);		//true
		System.out.println(97 == 65);				//false
		System.out.println("Java" != null);			//true
		System.out.println(3 * 2 == 5);				//false
	}
}