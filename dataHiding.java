class Rectangle
{
	private double length;
	private double breadth;
	public double getlength()
	{
		return length;
	}
	public double getbreadth()
	{
		return breadth;
	}
	public void setlength(double l)
	{
		length =l;
	}
	public void setbreadth(double b)
	{
		breadth = b;
	}
	public double area()
	{
		return length * breadth;
	}
	public double perimeter()
	{
		return 2*(length + breadth);
	}
	public boolean isSquare()
	{
		if(length == breadth)
			return true;
		else
			return false;
	}
}
class Test
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		r.setlength(10);
		r.setbreadth(5);
		System.out.println("Area of a rectangle : " + r.area());
		System.out.println("Perimeter of a rectangle : " + r.perimeter());
		System.out.println("Is it a square : " + r.isSquare());
		System.out.println("Displaying length : " + r.getlength());
		System.out.println("Displaying Breadth : " + r.getbreadth());
	}
}
