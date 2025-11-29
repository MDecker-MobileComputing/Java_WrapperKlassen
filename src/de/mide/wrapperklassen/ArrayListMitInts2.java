package de.mide.wrapperklassen;

import java.util.ArrayList;

public class ArrayListMitInts2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main( String[] args ) {
		
		ArrayList arrayList = new ArrayList<>();
				
		Integer int3  = Integer.valueOf( 3 );
		Integer int6  = Integer.valueOf( 6 );
		Integer int9  = Integer.valueOf( 9 );
		Integer int12 = Integer.valueOf( 12 ); 
		Integer int15 = Integer.valueOf( 15 );
		
		arrayList.add( int3  );
		arrayList.add( int6  );
		arrayList.add( int12 );
		arrayList.add( int15 );
		
		arrayList.add( 2, int9 ); // an dritter Stelle die 9 einfügen
		arrayList.remove( int15 );
	
		System.out.println( arrayList );
	}
}
