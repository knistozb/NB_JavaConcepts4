

package nb_cl8_hw8_pkg;

import java.util.Arrays;
import java.util.*;
import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.lang.*;


public class NB_cl8_hw8 {

	
	// Assignment:

		// 1. Create a Int Array[] with unsorted numbers and sort without using Arrays.sort() function
		
		// 2. Generate 500 RANDOM numbers, and find the Nth smallest number (range from 100 – 1000)
		 
		// 3. Ask the USER for a string (let’s assume they input “hello world”):
			// a. Find and Print the Duplicated Character (it should print: l o)
		 
	
	// KN to self:
		// "<br/>" == helps to break the array into different lines
		// \t Insert a tab in the text at this point. 
		// \b Insert a backspace in the text at this point. 
		// \n Insert a newline in the text at this point
	
	
	// Websites links for future reference :
	// 1. https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/#
	// 2. https://stackoverflow.com/questions/13548619/java-sort-integer-array-without-using-arrays-sort
	// 3. https://www.tutorialspoint.com/java-program-to-find-all-duplicate-characters-in-a-string
	// 4. https://www.javatpoint.com/program-to-find-the-duplicate-characters-in-a-string
	
	
	public static void main(String[] args) {

		// Question 1: Create a Int Array[] with unsorted numbers and sort without using Arrays.sort() function
		int [] q1 = {55555, 1, -333, -10, 22, 4444, 7};  // int array with unsorted numbers
		
		// Better way to print the original array:
		System.out.println("One way to print the original unsorted array is: ");
		System.out.println(Arrays.toString(q1));
		
		// another way to print the original: 
			System.out.println("Another way to print the original unsorted array is: ");
			for(int item1 : q1) {
				System.out.print(item1 + " , ");   
			}
			System.out.println("\n----------------------------------------------");
			
			// let's use sorting method:
			Arrays.sort(q1);
			System.out.println("\nThe new sorted array using sort method is: "); 
     
			for (int item2 : q1) {
				System.out.print(item2 + " , ");
			}
        
        System.out.println("\n==================================================");
        
        
        // let/s do it without using sorting method:
        
        int nk1;
        for(int i=0;i<q1.length-1;i++){
            for(int j=0;j<q1.length-1;j++){
                if(q1[j] > q1[j+1]){   // use < for Descending order
                    nk1 = q1[j+1];
                    q1[j+1] = q1[j];
                    q1[j]=nk1;
                }
            }
       }
       System.out.println("The new unsorted array without using sort method is: ");
       System.out.println(Arrays.toString(q1));
       
       System.out.println("\n=================== End of Question #1 ===============================");

       
       
       // Question 2: Generate 500 RANDOM numbers, and find the Nth smallest number (range from 100 – 1000)

		int max = 1000;
		int min = 100;
		
		Random random = new Random();
		int answer = random.nextInt((max - min + 1) + min);
//		int answer = random.nextInt(10) + 1;
	
		System.out.println("The random number from the range of 100-1000 is " + answer + ".");
		
	  System.out.println("\n========================================================");

		// Another actual way to generate an int array of 500 random numbers and find the smallest and largest inside of that
      Random rnum = new Random();
      int i;
      int[] num2 = new int[ 500 ]; // we want 500 random numbers ; so size should reflect that.
      num2[0] = rnum.nextInt(1000); // Init First number
      int largest = num2[0]; //Set it as largest
      int smallest = num2[0]; // Set it as smallest
      for (i = 1 ; i <  500; i++) 
      {
    	  num2[i ] = rnum.nextInt(1000); //Store numbers;
          largest = Math.max( largest , num2[i ] ); //Compare with previous largest           
          smallest = Math.min( smallest , num2[i ] );  //Compare with previous smallest
      }
      System.out.println("List of an array of 500 random numbers is: " + Arrays.toString(num2));
      System.out.println("Largest numbers is : " +largest);
      System.out.println("Smallest number is : " +smallest);
       
	  System.out.println("\n=================== End of Question #2  ===============================");

      
	  // Question 3. Ask the USER for a string (let’s assume they input “hello world”):
				// a. Find and Print the Duplicated Character (it should print: l o)
	  
	  System.out.println("Please give me a String?");
	  Scanner q3 = new Scanner (System.in);
	  String nk3 = q3.nextLine();
	  int count;
	  
	  char[] abc = nk3.toCharArray();  // converting user string input into char
	  
	  System.out.println("The original String given by the user is: " + nk3);
	  
	  System.out.print("The duplicate Characters in above String are: ");
	  for(int iii = 0; iii< nk3.length(); iii++) {   // count each character present in the String
		  count =1;
		  	for(int jjj = iii+1; jjj < nk3.length(); jjj++) {
		  		if (abc[iii] == abc[jjj] && abc[iii] != ' ') {   	// use this if you need to count the duplicates but only print once
		  			count++;
		  			abc[jjj]= ' ';
//		
		  	// Almost same but just little different scenario codes:
//		  		if (abc[iii] == abc[jjj]) {    				// use this if you need to count plus print every single of the duplicates 
//		  			System.out.print(abc[jjj] + " ");
//		            break;
		  		}
		  	}
		  	if (count > 1 && abc[iii] != '0') {
		  		System.out.print(abc[iii]);
		  	}
	  }
	  
	  System.out.println("\n=================== End of Question #3   ===============================");
	  System.out.println("\n>================ Congrats! You have successfully completed the JAVA ASSSIGNMENT #8 ========================<");

	  
    
	}

}
