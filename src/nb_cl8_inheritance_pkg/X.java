
///// JAVA Class 8 part 3.c: on May 14, 2023, Sunday with Instructor AP ////


package nb_cl8_inheritance_pkg;

public class X extends Y {
	
	
	
	// ======================================================================================

	
	public static void main(String[] args) {
		
		X objX = new X();
		objX.x2();
	}
	
	
	public static void x1() {
		System.out.println("x1");
	}
	
	public void x2() {
		super.y2();   // it will print the method from the parent's method y2 instead of y2 method here because of super keyword
		System.out.println("x2");
	}
	
	public void y2() {
		System.out.println("X child class y2");
	}
	
	
	

}
