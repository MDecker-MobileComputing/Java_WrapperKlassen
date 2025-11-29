package de.mide.wrapperklassen;

import java.util.ArrayList;

public class ArrayListMitInts1 {

	/**
	 * Integer-Objekte mit deprecated (veraltetem) Konstruktor erzeugen
	 * und in ArrayList-Klasse speichern.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked", "deprecation" })
	public static void main( String[] args ) {
		
		System.out.println();
		
		ArrayList arrayList = new ArrayList<>();
				
		Integer int3  = new Integer( 3 );
		Integer int6  = new Integer( 6 );
		Integer int9  = new Integer( 9 );
		Integer int12 = new Integer( 12 ); 
		Integer int15 = new Integer( 15 );
		
		arrayList.add( int3  );
		arrayList.add( int6  );
		arrayList.add( int12 );
		arrayList.add( int15 );
		
		arrayList.add( 2, int9 );
		arrayList.remove( int15 );
	
		System.out.println( arrayList );
		
		System.out.println();
	}
	
}
