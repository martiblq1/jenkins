package main;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

final class Geometry_test
{
	@Test
	@DisplayName("Tests if the method which returns the area of a square triangle is working correctly.")
	void test_square_triangle_area()
	{
		assertEquals(6.0, Geometry.get_square_triangle_area(3, 4), "The result should be 15.");
	}
	
	@Test
	@DisplayName("Tests if the method is void.")
	void test_print_result() throws NoSuchMethodException
	{
		Method method = Geometry.class.getMethod("print_result", double.class);
		Class<?> return_type = method.getReturnType();
		assertEquals(void.class, return_type, "The method should be void.");
	}
	
	@Test
	@DisplayName("Test if the method which returns the area of a rectangle is working correctly.")
	void test_rectangle_area()
	{
		assertEquals(16.0, Rectangle.get_area(4.0, 4.0), "The result should be 16.");
	}
}