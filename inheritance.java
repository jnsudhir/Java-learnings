class circle
{
	public double radius;
	public double area()
	{
		return Math.PI * radius *radius;
	}
}
class cylinder extends circle
{
	public double height;
    public double areaOfCylinder()
	{
		return 2*area() + 2* Math.PI *radius*height;
	}
}
class test
{
	public static void main(String args[])
	{
		cylinder c2 = new cylinder();
		c2.radius = 5;
		c2.height = 10;
		System.out.println("Area of a circle : " + c2.area());
		System.out.println("Area of a Cylinder : " + c2.areaOfCylinder());
	}
}
