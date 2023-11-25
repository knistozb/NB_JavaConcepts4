
///// JAVA Class 8 part 1.a: on May 14, 2023, Sunday with Instructor AP ////


package nb_cl8_constructors2_1_pkg;

import nb_cl8_constructors_2_2_pkg.NB_cl8notes_constructors2_2_B;

public class NB_cl8notes_constructors2_1_A {


	
	
	
	
	
	// Important rules of object/instance/bridgeName/this:
			// 1. "This" keyword can only be used inside non-static method
			// 2. "This" is used to refer that you are calling something from the same class, and that method is most likely a non-static method
			// 3. Because the proper way to call something that's static should be using the className or this
			// 4. "This" basically means the CLASSname and we should only use to call a non-static method inside the non-static method within the same class
		

	// if you are in the same class, and have non-static method, you DO NOT need an object to call another non-static method.
	// but default constructor won't get called as we havent used the object. However, this is not the proper way.
	// KN: static to non-static won't work without an object, but non-static to non-static will work
	
	// "this" word is used to replace the same className you are currently in and used interchangeably. 
	// use THIS if you need to call a static to non-static or non-static to non-static inside the same class
	// this keyword if used with static to non-static method is not a proper way. Try use it for only non-static to non-static
	
	
	// chain formation: 
	// 1.  main() calls the default constructor NB_cl8notes_constructors2_1_A() then prints its syso 
	// 2. ==> one() gets called, prints its syso then it goes to the default constructor to print its syso again
	// 3. ==> two() gets called, prints its syso then it goes to the default constructor again to print its syso again
	// 4. ==> three() gets called, prints its syso, then it is complete externally. BUTTTTTT,  
	// 5. ==> then it goes back to re-trace who called that ALL THE WAY BACK, ...goes to method two() and goes back to method three(), prints the syso then back to method one()....
				// but since all that are already printed except all that are left are the last syso of method one(), and main() which then gets printed. 
				// Then, the whole process is officially complete.

	
	// ===============================================================================

	
// Exercise 4 : 
	
	public static void main(String[] args) {
		NB_cl8notes_constructors2_1_A objA = new NB_cl8notes_constructors2_1_A();
		objA.one();
		System.out.println("OFFICIALLY END OF THIS PROGRAM!!");
	
		
	}
	
	public NB_cl8notes_constructors2_1_A() {		
		System.out.println("Default Constructor from Class A - 2.1 pkg");
	}
		
	public void one() {
		
		System.out.println("Method one");
		two();
		System.out.println("ALmost the end....!");
	
//		 NB_cl8notes_constructors2_2_B.two();  
		// wont work because you cannot call static to non-static without an object if they are in different classes

		NB_cl8notes_constructors2_2_B objB = new NB_cl8notes_constructors2_2_B();
		objB.two();
		System.out.println("test method 2 from diff class");
	
		this.two();
		
	}
	
	public void two() {
		
		System.out.println("Method two");
		three();
		three();
	}
	
	public void three() {
		System.out.println("Method three");
	}	
}	
	
	
	/*
// Exercise 3 : 

	public static void main(String[] args) {
			
			String user = "james";
			String pw = "123321";
			
			login(user, pw);
			
	}
	
	public static void login(String a, String b) {
		
		if (a & b == correct) {
			profilePage();
		}
		else {
			loginError();
		}
	}	
	
	public static void loginError() {
		if(error came after 5 tries) {
			forgetPassword();
		}
		else {
			blockuser();
		}
	}
	
	public static void profilePage() {
		
	}
	
}	
	*/	

	/*
// Exercise 2 : 
	
		public static void main(String[] args) {
			
			// Boolean constructor using parameterization
//			NB_cl8notes_constructors2_1_A objA = new NB_cl8notes_constructors2_1_A(false);
//			NB_cl8notes_constructors2_1_A objA = new NB_cl8notes_constructors2_1_A(true);
			
			// calling the constructor: almost default as its got no arguments but has syso so not exactly default/system
			NB_cl8notes_constructors2_1_A objA = new NB_cl8notes_constructors2_1_A();
			objA.one();
			System.out.println("OFFICIALLY END OF THIS PROGRAM!!");
			// chain formation: 
				// 1.  main() calls the default constructor NB_cl8notes_constructors2_1_A() then prints its syso 
				// 2. ==> one() gets called, prints its syso then it goes to the default constructor to print its syso again
				// 3. ==> two() gets called, prints its syso then it goes to the default constructor again to print its syso again
				// 4. ==> three() gets called, prints its syso, then it is complete externally. BUTTTTTT,  
				// 5. ==> then it goes back to re-trace who called that ALL THE WAY BACK, ...goes to method two() and goes back to method three(), prints the syso then back to method one()....
							// but since all that are already printed except all that are left are the last syso of method one(), and main() which then gets printed. 
							// Then, the whole process is officially complete.
			
		}
		
		// empty constructor but with a syso
		public NB_cl8notes_constructors2_1_A() {
			
			System.out.println("Default Constructor from Class A - 2.1 pkg");
		}
		
		// this one is default constructor without any arguments or sysos
//		public NB_cl8notes_constructors2_1_A() {
//		}
		
		public NB_cl8notes_constructors2_1_A(boolean print) {
			if(print == true) {
				System.out.println("print if true!");
			}
		}
		
		// you can avoid putting your own constructor as the JAVA uses its own built in constructor if in case we dont want to. 
		
		public void one() {
			
			System.out.println("Method one");
			NB_cl8notes_constructors2_1_A objA = new NB_cl8notes_constructors2_1_A();
			objA.two();
			System.out.println("ALmost the end....!");
		}
		
		public void two() {
			
			System.out.println("Method two");
			NB_cl8notes_constructors2_1_A objA = new NB_cl8notes_constructors2_1_A();
			objA.three();
			objA.three();
		}
		
		public void three() {
			System.out.println("Method three");
		}
}	
	*/

	/*
// Exercise 1 : Construction chain concept
	
	public static void main(String[] args) {


		NB_cl8notes_constructors2_1_A objA = new NB_cl8notes_constructors2_1_A();
		objA.one();
		// chain formation: main() calls ==> one() calls ==> two() calls ==> three() then it goes back the reverse way to start printing their sysos			
	}
	
	public NB_cl8notes_constructors2_1_A() {		
		System.out.println("Default Constructor from Class A - 2.1 pkg");
	}
	
	public void one() {
		NB_cl8notes_constructors2_1_A objA = new NB_cl8notes_constructors2_1_A();
		objA.two();
		System.out.println("Method one");
	}
	
	public void two() {
		NB_cl8notes_constructors2_1_A objA = new NB_cl8notes_constructors2_1_A();
		objA.three();
		System.out.println("Method two");
	}
	
	public void three() {
		System.out.println("Method three");
	}	
}
	*/



