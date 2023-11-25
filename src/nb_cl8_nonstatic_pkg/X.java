
///// JAVA Class 8 part 3.b: on May 14, 2023, Sunday with Instructor AP ////


package nb_cl8_nonstatic_pkg;

public class X {

	
	
	// foR STATIC, along the way if someone changes the value, then the value is changed for forever for others until another changes
		// even different objects/methods, it affects everybody with that new change
		// it changes once we change; otherwise it stays the same for every others after its creations
	
	// VS
	
	// for Non-static, it does not affect others
		// even if you change the value by creating an object.variable, it only changes for that specific one
		// if you create another object, then the value is reset back to the original value instead of continuing from its last updated value unlike in static methods
		// you do whatever you do in your house
	
	// In plain English, Static means stationary/fixed
	// Non-static means capable of changes; energetic; dynamic
	

	
	// ======================================================================================

	
	
// Exercise 3: 	
	
	public static int a = 5; 
	
	public int abc = 7;

	public static void main(String[] args) {



			
			X x = new X();
			System.out.println(x.a); // 5 
			
			x.a = 600;
			System.out.println(x.a);   // 600
			
			X x2 = new X();
			System.out.println(x2.a);  // 600   // also calling static to static using object is not the proper way
			// this new object x2 does not reset back to the original value of a since it's static to static 
			
			x2.a = 700;
			System.out.println(x2.a);  // 700
			
			System.out.println("===============");
			
			// calling non-static from static
			System.out.println(x2.abc);    // 7
			x2.abc = 100;    // it should change the value to 100 ...
			System.out.println(x2.abc);   // 100
			
			X x3 = new X();
			System.out.println(x3.abc);  // 7 it should reset back to original abc = 7 since new object, new me, but old value first
			
			x3.abc = 200;
			System.out.println(x3.abc);   // 200
			
		
			test();  // 700
			// even different objects/methods, it affects everybody with that new change
			
			System.out.println("===============");

			Y.zz(); // 9 20 99 9...calling another static method from another class
				// open Y class for clarification
		}
		
		public static void test() {
			X x = new X();
			System.out.println(x.a);  // 700
			
		}	
}	
	
	
	
	/*
// Exercise 2: 	
	
	public int a = 5;    // this is non-static method
	
	public static void main(String[] args) {


//		System.out.println(a); // 5
		
//		System.out.println(X.a);  // 5
		
//		a = 6;
//		System.out.println(a);   // 6
//		System.out.println(X.a);  // 6
		// all above wont work unless object is created coz they are static to non-static
		
		
		X x = new X();    // object is needed to call static to non-static methods
		System.out.println(x.a); // 5 
		
		x.a = 600;
		System.out.println(x.a);   // 600
		
		X x2 = new X();   // another object creations will reset the value of a
		System.out.println(x2.a);  // 5 
		// this new x2 photocopy goes back to the original value of b 
		x2.a = 700;
		System.out.println(x2.a);  // 700
	
		test();  5
		
	}
	
	public static void test() {
		X x = new X();
		System.out.println(x.a);  // 5
		
	}	
}	
	*/
	
	/*
// Exercise 1: 	
	
	public static int a = 5;    // this is static method

	public static void main(String[] args) {


		System.out.println(a); // 5 .... all below will work since its calling static to static
		
		System.out.println(X.a);  // 5
		
		a = 6;
		System.out.println(a);   // 6
		System.out.println(X.a);  // 6

		X x = new X();
		System.out.println(x.a); // 6 even if the object is created, the value refers to the last value of a which is 6
		
	}
}
	*/
