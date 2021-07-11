class test
{
	public static void main(String[] args)
	{
		System.out.println("Main begin");
		fun1();
		System.out.println("Main Ends");
	}
	public static void fun1()
	{
		System.out.println("fun1() begins");
		fun2();
		System.out.println("fun1() Ends");
	}
	public static void fun2()
	{
		System.out.println("Inside fun2()");
	}
}
