class Rectangle
{
	private double length;
	private double breadth;
	public Rectangle()               //Constrctor withut parameters
	{
		length = 1;
		breadth = 1;
	}
	public Rectangle(double l , double b)   //constructor with Parameters
	{
		length = l;
		breadth = b;
	}
	public Rectangle(double s)           //constructor with only 1 parameter
	{
		length = breadth = s;
	}
	public double area()
	{
		return length * breadth;
	}
}
class Test
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle(5);
		System.out.println("Area of a rectangle : " + r.area());
	}
	
}
