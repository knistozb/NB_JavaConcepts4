
///// JAVA Class 8 part 3.a: on May 14, 2023, Sunday with Instructor AP ////


package nb_cl8_nonstatic_pkg;

public class NB_cl8notes_nonstatic {

	
	
	
	
// Exercise 2:	
	
	// for static, if one photocopy/object changes, it reflects back on that change for the next ones
	// one box if affected/changed, affects rest of the other boxes as well
	// use this way if you want to make changes to the whole
	// one common thing so same for others if someone changes it
	
	
	public static int a = 10;
	
	public int b = 20;
	
	public static void main(String[] args) {

//		System.out.println(a);
		
		
		Y.zz();
		
		
		NB_cl8notes_nonstatic objNS = new NB_cl8notes_nonstatic();
		System.out.println(objNS.a);  // 10
		objNS.a = 55;
		System.out.println(objNS.a);  // 55 
		
		NB_cl8notes_nonstatic objNS2 = new NB_cl8notes_nonstatic();
		System.out.println(objNS2.a);  // 55 but it shuda been 10 as per non-static rule
//		
		objNS2.a = 99;
		System.out.println(objNS2.a);   // 99
//		
		NB_cl8notes_nonstatic objNS3 = new NB_cl8notes_nonstatic();
		System.out.println(objNS3.a);   // 99 but it shuda been 10 as per non-static rule
//		 
		System.out.println(NB_cl8notes_nonstatic.a);  // still prints 99 coz it refers back to its last value of a  from above it
//	
	
	
	}
}
	
	
// Exercise 1:

	// for non-static methods, they operate their own silos (independent divisions of buildings)
	// different independent memory box so the change wont be affected to other boxes
	// use this if you wish to make changes separately
	// different grounds so it changes for only that changed box. for others, it is unaffected and refers to the original to start with


////	public static int a = 10;
//	
//	public int b = 20;
//	
//	public static void main(String[] args) {
//
////		System.out.println(a);
//		
//		NB_cl8notes_nonstatic objNS = new NB_cl8notes_nonstatic();
//		System.out.println(objNS.b);  // 20
//		objNS.b = 55;
//		System.out.println(objNS.b);  // 55 coz I only changed the vale of b to 55 for ns object only
//		
//		NB_cl8notes_nonstatic objNS2 = new NB_cl8notes_nonstatic();
//		System.out.println(objNS2.b);  // 20 coz it will refer back to the original value of b = 20
//		System.out.println(objNS.b);  // 55
//		objNS2.b = 99;
//		System.out.println(objNS2.b);   // 99
//		
//		NB_cl8notes_nonstatic objNS3 = new NB_cl8notes_nonstatic();
//		System.out.println(objNS3.b);   // 20
//		
//	}
//	
// 
//
//}
