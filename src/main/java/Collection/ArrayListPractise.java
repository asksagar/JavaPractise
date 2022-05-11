package Collection;

import java.util.ArrayList;

public class ArrayListPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(7);
		a1.add(4);
		a1.add(21);
		System.out.println(a1);
		System.out.println("Size: "+a1.size());
		
		a1.add(1, 45);
		System.out.println(a1);
		System.out.println("Size: "+a1.size());
		
		// ************************************************************* 
		ArrayList<String> languages=new ArrayList<String>();
		languages.add( "SQL" );
		languages.add( "Java" );
		languages.add( "HTML" );
		languages.add( "PHP" );
		languages.add( "Perl" );
		System.out.println(languages);
		
		//languages.size()=10;
		
		
		// 1. Write a code prints the number of elements in languages.
		System.out.println("the number of elements in languages: "+languages.size());
		
		// 2. Write code retrieves the String “HTML” from languages (without deleting it) and assigns it to the String variable webLanguage.
		String webLanguage=languages.get(2);
		System.out.println("webLanguage: "+webLanguage);
		
		// 3. Write a code replaces “HTML” with “C++” in languages.
		languages.set(2, "C++");
		System.out.println(languages);
		
		// 4. Write a code prints all the elements of languages that start with the letter P.
		
		for(int i=0; i<languages.size(); i++)
		{
			if(languages.get(i).startsWith("J"))
				System.out.println(languages.get(i));
		
		}
		
		for(String s:languages)
		{
			if (s.charAt(0)=='P')
				System.out.println(s);
			
		}
		
		ArrayList<Double> al;
		ArrayList<Float> a2 = new ArrayList<Float>(); 
		//ArrayList<Double> a3=new ArrayList<Float>();
		
		ArrayList<Double> a = new ArrayList<Double>( );
		a.add( 2.3 );
		a.add( 8.4 );
		// a.add( 5 ); // line 11
		a.add( (double) 5 ); // OR
		a.add( 5.0 );
		System.out.println(a);
		
		ArrayList<Character> a3 = new ArrayList<Character> ( );
		a3.add( 'X' );
		a3.add( 'A' );
		a3.add( 'V' );
		a3.add( 'A' );
		//a3.set( 1, 'J' );
		a3.set( 0, 'J' );
		
		for ( Character c : a3 )
			System.out.print( c + " " );
	}

}
