

///// JAVA Class 8 part 1.c: on May 14, 2023, Sunday with Instructor AP ////


package nb_cl8_constructors2_1_pkg;

public class NB_cl8notes_constructors2_1_Z {

	
	// simply ---> to call static: CLASSname.methodName();
	// to call non-static, do methodName directly or use this.methodName

	// For the constructor, the chaining has to be on the top before the syso
	// for the method, it can be anywhere
	// 1 constructor can have only 1 chain on it... cannot have more than 1 chain inside the same constructor
	
	
	
	// ===============================================================================
	
	
	
// Exercise 3:
	
	public static int number = 100;
	public String word = "apple";
		
	public static void main(String[] args) {

		// another similar parameterized constructor example:
		NB_cl8notes_constructors2_1_Z objZ1 = new NB_cl8notes_constructors2_1_Z();
		objZ1.sum(5, 2);  // 107
		
		NB_cl8notes_constructors2_1_Z objZ2 = new NB_cl8notes_constructors2_1_Z();
		objZ2.sum(10);
//		objZ2.sum(5, 2);  // 907
		
		// this one is customized/parameterized constructor
		NB_cl8notes_constructors2_1_Z objZ3 = new NB_cl8notes_constructors2_1_Z(500);
		objZ3.sum(5, 2);  // 507

		// below is just empty default constructor either we make it or it's provided by the java
//		NB_cl8notes_constructors2_1_Z objZ = new NB_cl8notes_constructors2_1_Z();
//		objZ.sum(5, 2);  // 107

			
		// steps of what's happening:
			// 1. it uses the int constructor to replace the a with value 500
			// 2. Do right hand side first to replace a with 500...then it updates the CLASSname.number to 500 which then updates the value of "number" to 500 from 100
			// 3. then it does the sum method to print (a = 5) + (b = 2) + (number = 500) = 507 as the final answer
		
	}
	// below is just the default constructor that will be used if no other parameterized constructor is not given
	public NB_cl8notes_constructors2_1_Z() {
		
	}
	
	public NB_cl8notes_constructors2_1_Z(int a) {
		NB_cl8notes_constructors2_1_Z.number = a;   // 500
	}
	
	public void sum(int abc) {
		System.out.println(abc + 200);
	}
	
	public void sum(int a, int b) {
		System.out.println(a+ b+ number);  // 507	
	}	
}
	
	
	
	/*
// Exercise 2:
	public static int number = 100;
	public String word = "apple";
	
	public static void main(String[] args) {

		NB_cl8notes_constructors2_1_Z objZ = new NB_cl8notes_constructors2_1_Z();
		objZ.sum(5, 2);
		
	}
	
	public void sum(int a, int b) {
		System.out.println(a+ b+ number);  // 5 + 2 + 100 = 107
	}
}
	*/
	
	/*
// Exercise 1:
	
	public static int number = 100;
	public String word = "apple";
	
	public static void main(String[] args) {

		NB_cl8notes_constructors2_1_Z objZ = new NB_cl8notes_constructors2_1_Z(5);
		
	}
	
	public NB_cl8notes_constructors2_1_Z() {
		System.out.println("Default Constructor - No Args");
	}
	
	public NB_cl8notes_constructors2_1_Z(int a) {
		
		this("helloNishhh");  // hello is saved under String b since a is saved as the integer
//		this(); // you can just do this if you are inside a constructor and need to call another default empty constructor
		// this() is just referring to the default constructor
//		this.NB_cl8notes_constructors2_1_Z2(); // same as below for calling non-static
		// this.CLASSname is referring to a class
//		NB_cl8notes_constructors2_1_Z2();  	// same as above
		// for non-static, do methodName directly or use this.methodName
		
		NB_cl8notes_constructors2_1_Z.NB_cl8notes_constructors2_1_Z();	
		// simply for static: CLASSname.methodName();
		System.out.println(number +a );
	}
	
	public NB_cl8notes_constructors2_1_Z(String b) {
		this();
		System.out.println(this.word + "nk"+ b);
	}
	
	public static void NB_cl8notes_constructors2_1_Z() {
		System.out.println("Static Method Z");
	}
	
	public void NB_cl8notes_constructors2_1_Z2() {
		System.out.println("Method Z2");
	}
	
//	public void NB_cl8notes_constructors2_1_Z() {
//		System.out.println("Non-static Method Z");
//	}
	
}
	*/
	
	