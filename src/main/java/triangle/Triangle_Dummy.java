package triangle;

public class Triangle_Dummy {

	public static TriangleType classify(double a, double b, double c) {
		
		if(a == b && a == c) {
			return TriangleType.EQUILATERAL;
		} else if (a == b || a == c || c == b) {
			return TriangleType.ISOSCALES;
		}
		
		return TriangleType.SCALENE;
	}

}
