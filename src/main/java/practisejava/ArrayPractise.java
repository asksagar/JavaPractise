package practisejava;

public class ArrayPractise {
	
	public static void main(String[] args) {
		
		//int a1[];
		//int[] b1;
		//int [] a1= {12, 25, 16};
		
		double [ ] a13 = { 12.5, 48.3, 65.0 }; 
		System.out.println("answer of question 13: " + a13[1] ); 
		
		int [ ] a14 = new int [6]; 
		System.out.println("answer of question 14: " +  a14[4] ); 
		
		double [ ] a15 = { 12.5, 48.3, 65.0 }; 
		System.out.println( "answer of question 15: " +  a15.length ); 
		
		int [] a16= {12, 48, 65};
		System.out.print("answer of question 16:");
		for (int i=0; i<a16.length; i++)
			System.out.println (" "+a16[i]);
		
		int [ ] a17 = { 12, 48, 65 }; 
		System.out.println("answer of question 17:");
		for ( int i = 0; i < a17.length; i++ ) 
		System.out.println( "a[" + i + "] = " + a17[i]); 

		int s = 0; 
		int [ ] a18 = { 12, 48, 65 }; 
		for ( int i = 0; i < a18.length; i++ ) 
		s += a18[i]; 
		System.out.println("answer of question 18:"+ "s = " + s ); 
		
		// **********   19. This code assigns the value 10 to all the elements of an array a.	*********
		int [ ] a19 = new int[25];
		for ( int i = 0; i < a19.length; i++ )
		{
		// your code goes here
			a19[i]=10;
			
		}
		for ( int i = 0; i < a19.length; i++ )
		System.out.println("answer of question 19:a[" +i +"]" +a19[i]);
		// **********   19 completed   *********

	
	
		// **********  20. This code prints all the elements of array a that have a value greater than 20.*********
		double [ ] a20 = { 45.2, 13.1, 12.8, 87.4, 99.0, 100.1, 43.8, 2.4 };
		for ( int i = 0; i < a20.length; i++ )
		{
			// your code goes here
			if(a20[i]>20)
				System.out.println("answer of question 20:" + a20[i]);
		}
		// ********** 20 completed  *********
		
		// **********  21. This code prints the average of the elements of array a.	*********
		int [ ] a21 = { 45, 13, 12, 87, 99, 100, 43, 2 };
		double average = 0.0;
		int sum=0;  /// added by me
		
		for ( int i = 0; i < a21.length; i++ )
		{
		// your code goes here
			sum+=a21[i];			
		}
		// ... and your code continues here
		average=sum/a21.length;
		System.out.println("answer of question 21:" + average);
		
		// **********  21 completed	*********
		
		/*
		/ ********** 22. This code prints the following three lines:	*********
			a[0] = 3
			a[1] = 6
			a[2] = 10
		*/
			System.out.println("answer of question 22:");
			int [ ] a22 = { 3, 6, 10 };
			for ( int i = 0; i < a22.length; i++ )
			{
			// your code goes here
				System.out.println("a[" + i + "] = " + a22[i]);
			}
			
		// **********  22 completed	*********
		
		/*
		/ **********  23. Carry out the following tasks with an array:	**********
			a. Allocate an array a of ten integers.
			b. Put the number 17 as the initial element of the array.
			c. Put the number 29 as the last element of the array.
			d. Fill the remaining elements with –1.
			e. Add 1 to each element of the array.
			f. Print all elements of the array, one per line.
			g. Print all elements of the array in a single line, separated by commas.

		 */
			int [] a23= new int [10];
			a23[0]= 17;
			a23[9]= 29;
			
			for (int i=1; i<a23.length-1; i++)
				a23[i]=-1;
			
			for (int i=0; i<a23.length; i++)
				//a23[i]=a23[i]+1;
				a23[i]+=1;
			
			System.out.println("answer of question 23 (f): ");
			for (int i=0; i<a23.length; i++)
				System.out.println("a[" + i + "] = " + a23[i]);
			
			System.out.println("answer of question 23 (g): ");
			for (int i=0; i<a23.length; i++)
				System.out.print( a23[i] +", ");
						
		// **********  23 completed	*********
			System.out.println();
		// ********** 24. Write a program that contains a bounds error. **********
			
			System.out.println("answer of question 24 : ");
			double [] a24= {12, 23, 34, 45};
			System.out.println(a24[5]);
			
		// **********  24 completed	*********
			
	}
}
