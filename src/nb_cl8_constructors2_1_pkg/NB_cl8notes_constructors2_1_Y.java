
///// JAVA Class 8 part 1.b: on May 14, 2023, Sunday with Instructor AP ////


package nb_cl8_constructors2_1_pkg;

public class NB_cl8notes_constructors2_1_Y {

	
	
	// Important object/instance/bridgeName/this Rules:
		// 1. "This" keyword can only be used inside non-static method
		// 2. "This" is used to refer that you are calling something from the same class, and that method is most likely a non-static method
		// 3. Because the proper way to call something that's static should be using the className or this
		// 4. "This" basically means the CLASSname and we should only use to call a non-static method inside the non-static method within the same class
		// 5. Use "this" only if inside the same class
	
	
	// if I am calling static method, then it doesn't matter where I am (whether inside static or non-static methods while calling)
	// But if I am calling a non-static method then I must create an object
	// non-static calling non-static using "this" keyword will work as long as they both are in the same class
	
	
	// ===============================================================================

	
// Example 1:
	
	public int a = 10;
	
	public static int b = 99;
	
	public static void main(String[] args) {

		
		NB_cl8notes_constructors2_1_Y objY = new NB_cl8notes_constructors2_1_Y();
		objY.abc();
		
		
//		this.abc(); // wont work unless you create an object		
//		test();		// will work because you are dealing with static to static
//		System.out.println(a);  // it wont print coz it is static to non-static method unless you got an object
//		System.out.println(b);  // it will print 99 because it is static to static
	}
	
	public static void test() {
		
//		System.out.println(NB_cl8notes_constructors2_1_Y.b);
		// CLASSname.methodName if you need to print the global b = 99
		
		int b = 77;  
//		System.out.println(b);  // this will print local b = 77 instead of global b = 99
//		System.out.println(a);  // wont print coz global a is non-static method
//		System.out.println(NB_cl8notes_constructors2_1_Y.a); // wont work coz static to non--static needs an object like shown below:
		NB_cl8notes_constructors2_1_Y objY = new NB_cl8notes_constructors2_1_Y();
		System.out.println(objY.a);   // will now print the global value of a since it can now call using ibject
		
	}
	
	public void abc() {
	
		int a = 5;
		int b = 7;
		System.out.println(NB_cl8notes_constructors2_1_Y.b);
		System.out.println(this.a);  // gotta use an object since non-static to non-static
		this.abc();  // will work coz non-static to non-static
		this.test();  // warning coz non-static to static
		// if you want to use the global value of a and b
		
		this.test();   // you can still call non-static to static, but comes with a warning since it is not a proper way
		
		this.abc();  // non-static calling non-static using this will work as long as they both are in the same class
		System.out.println(this.a);
		System.out.println(b);
		System.out.println(a);
	}

}
