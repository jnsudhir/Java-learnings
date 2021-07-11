class test
{
	int x ,  y;
}
class pass
{
	public static void main(String[] args)
	{
	test t = new test();
	t.x = 5;
	t.y = 10;
	fun(t);
		System.out.println(t.x+ " " +t.y);
	}
	public static void fun(test t)
	{
		
		t.x = 10;
		t.y = 10;
	}
	
}
