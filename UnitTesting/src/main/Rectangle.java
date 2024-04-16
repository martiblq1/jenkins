package main;

final class Rectangle
{
	static double get_area(final double a, final double b)
	{
		if(a <= 0 || b <= 0)
		{
			throw new IllegalArgumentException("Both sides must be greater than 0.");
		}
		
		return a*b;
	}
}