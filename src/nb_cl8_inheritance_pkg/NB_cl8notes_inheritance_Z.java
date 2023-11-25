
///// JAVA Class 8 part 3.a: on May 14, 2023, Sunday with Instructor AP ////


package nb_cl8_inheritance_pkg;

public class NB_cl8notes_inheritance_Z extends Y {
	
	// to finalize the class so no other classes can inherit it:
// final public class NB_cl8notes_inheritance_Z  {

	
	
	
	// Child NB_cl8notes_inheritance_Z is extending to parent Y
	// SubClass Z (child class) is extending to SuperClass Y (parent class)
	// whatever before extends is the child
	// whatever after extends is the parent
	// we can use/call from any methods if they are inherited
	// only the child can call anything that it inherited or owned... just like child owns all of parent's property
	// but the parent cannot call the child directly. just like parent doesnt own child's property
	
	
	// Final keyword: 
		// used in a variable to finalize its value, or used in a class to deny the inheritance
	// Private: 
		// it helps to make that method available for within that class only. Cannot inherit from other class either
	// Super: 
		// it is used to call/override methods from parents class as long as it is non-static 
		// if the child has similar method and inherits parent's methods, it calls the parents class's methods instead of child's 
	
	// Z --> X --> Y --> K
	
	
	// Inheritance is basically when you have this child and parent relationship where child is inheriting from the parents. can have everything inside the class as long as they are public
		// Let's say we have class A and class B. If I want class A to inherit from class B THEN it can be done by typing A extends B. Here, A is considered subclass or the child while B is considered a parent or superclass. 
	
	// IQA 1: What does the "extends" keyword do?
		// Extend is actually used to perform the concept of inheritance. 
			// why? --> it allows the child class or subclass to inherit the parent class or superclass
	
	// IQA 2: Does java allow multiple inheritance at one time in terms of parents?
		// ==> No, it has to be applied to only 1 to 1 generation. 
			// ==> you can have multiple child inheriting same parent, but cant have same child inheriting multiple parents
			// Inheritance cannot be done within same class. Has to be done in a hierarchy level. 
	
	// IQA 3: Why do we use inheritance in real work scenario?
		// ==> we use to make our work convenient. if we have hundreds of classes, we will need to make object for everything. But with this feature, we can use the same object to connect different methods in different classes 
	
	// IQA 4: Give some code and ask is the concept of subclass here?
		// if it has an object connecting method from different class, if it is in some class but calling different method from other classes...look for those features. 
	
	// IQA 5: WHAT does the final keyword do?
		// Final keyword when used in a data type variable, then that initialized variable has the final value. After that nobody can change that value.
		// Final keyword when used on a class, then that class cannot be inherited. 
		// Final keyword when used on a method, then that method cannot be overridden, but still can be inherited. It means child can still inherit and call,but cannot override or make another method exactly same to the parent's final method. 
			// but it can be overloaded using distinguishing arguments with the same method name
	
	// IQA 6: Will the super keyword work if you are not inheriting?
		// ==>  No, it wont work if inheritance is not happening because super has to represent a parent 
	
	// IQA 7: Can you use the super keyword in the main method?
		// ==> No, you cannot because main method uses static, and super has to be done inside a non-static method only 
	
	// IQA 8: Overload Vs Override?
		// ==> Overload comes from the concept of polymorphism where we can have same method name as long as they are distinguished with different input parameters/arguments/substrings. 
		// ==> Override comes from the concept of inheritance where a child and a parent have the same methods. 
					// In that case, child is overriding the parent method meaning if we call that method, it will call the child method. In that case, super keyword can be used to override to use the parent method instead. 
	
	// IQA 9: How can you stop overriding meaning parent doesn't want the child to inherit to anyone else?
		// ==> we use the word final in front of that child class so that class will stop inheriting from that point on to its future child, but it will still inherit all from its parent
	
	// IQA 10: Can you override if final is used in parent method?
		// ==> No, you cannot. final method of parent class means you can inherit it, but you cannot override it meaning child cannot duplicate another and be able to use the same exact method from the parent
	
	
	
	// ======================================================================================
	
	
	
// Exercise 2:
	public static void main(String[] args) {
		
		
		
		// super.y2(); // wont work coz super cannot be used in a static method
		
		NB_cl8notes_inheritance_Z objZ = new NB_cl8notes_inheritance_Z(); // gotta make object to call non-static methods from this main static method
		objZ.y2();    // child y2
		
		y1();   // child y1
			// it will call the local child y1 instead of y1 from parent class Y
		System.out.println("======1=====");
		
		objZ.exe();  // 
		
		
	}
	
	public void exe() {
		
		y1();   // child y1
		System.out.println("====2=======");

		super.y1();   
		System.out.println("=====3======");

		NB_cl8notes_inheritance_Z objZ = new NB_cl8notes_inheritance_Z();
		objZ.y2();
		System.out.println("=====4======");

		super.y2();
		
	}
	
	public static void y1() {
		System.out.println("child y1 from Z");
	}
	
	public void y2() {
		System.out.println("child y22");
	}
}	
	
	
	/*
// Exercise 1:
	
	public static void main(String[] args) {
		
//		NB_cl8notes_inheritance_Z.y3();  // wont work because that method is private for Y class only
		
		// possible coz you can SIMPLY call static to static methods by using className.methodName();
		X.k1();  
		System.out.println("========1==========");
		Y.y1();  
		System.out.println("=======2===========");
		
		// below are possible coz the child class Z is inheriting the parent class: 
			// Z --> X --> Y --> K
		NB_cl8notes_inheritance_Z.k1();    // Z --> X --> Y --> K
		System.out.println("=========3=========");
		NB_cl8notes_inheritance_Z.y1();    // Z --> X --> Y --> K
		
		System.out.println("========4==========");
		Y y = new Y();     // gotta make object to call non-static methods from this main static method
		y.y2();
//		objZ.y2(); /// not possible because y2 does not belong to class Z
		System.out.println("========5==========");
		y1(); // this is not possible because y1 is a different class Y unless its inherited
		System.out.println("========6==========");
		Y.y1();
		System.out.println("========7==========");
		NB_cl8notes_inheritance_Z objZ = new NB_cl8notes_inheritance_Z();   // gotta make object to call non-static methods from this main static method
		objZ.z2();
		System.out.println("========8==========");
		NB_cl8notes_inheritance_Z.z1();
		System.out.println("=========9=========");
		z1();
		
	}

	public static void z1() {
		System.out.println("z1");
	}
	
	public void z2() {
		System.out.println("z2");
	}
	
}
	*/



