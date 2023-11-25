
///// JAVA Class 8 part 3.c: on May 14, 2023, Sunday with Instructor AP ////


package nb_cl8_nonstatic_pkg;

public class Y {

	// Execution wise, for static, I look top to bottom
	// 
	
	// Question to ask the instructor???
	// AP said if static int value then called by static main method for the non-static test, the value will remain whatever the last is ?
		// but since it changes from static to non-static, the value refers back to the original, not the changed one
	
	
	
	
	
// EXERCISE 3:
	
	public  int a = 9;
	
	public static void zz() {
			
		Y y = new Y();
		System.out.println(y.a);   // 9
			
		y.a = 20;
		System.out.println(y.a);  // 20 since it takes local value
				
		Y y1 = new Y();
		y1.test();          // 99 coz it goes inside the test constructor and takes the new value of y from test method
					// then it prints y1.99 is 99... here we are only calling and not storing or changing the value of a for y1
		
		System.out.println(y1.a);   // 9 coz object y1 is for the first time calling the value of a and 
						// since its calling non-static, it resets the value to original value of a =9 
						
	}
		
	public void test() {
		Y y2 = new Y();
		y2.a = 99;
		System.out.println(y2.a);  // 99
	}
}	
	
	
	
//// EXERCISE 2:
//	
//	public static int a = 9;
//	// since this is static, if someone changes it, the rest will get the changed value
//	
//	public static void zz() {
//		
//		System.out.println(a);   // 9
//		
//		int a = 20;
//		System.out.println(Y.a);  // 9 since it takes global value
//		System.out.println(a);  // 20 since it takes local value
//			
//		Y y = new Y();
//		y.test();   // 9
//		
//		System.out.println(a);  // 20
//		
//	}
//	
//	public void test() {
//		Y.a = 99;
//		System.out.println(Y.a);  // 99
//	}
//}		
	
	
	
// EXERCISE 2:
	
//	public static void zz() {
//		System.out.println(X.a);
//		
//	}
//}	
	
// Exercise 1:
	
//	public static void main(String[] args) {
//
//		System.out.println(X.a);  // 5 since this main method is not going to run the other main method from class X	
//	}
//}
