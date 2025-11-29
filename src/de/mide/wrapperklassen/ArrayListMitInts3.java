package de.mide.wrapperklassen;

import java.util.ArrayList;

public class ArrayListMitInts3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main( String[] args ) {
		
		ArrayList arrayList = new ArrayList<>();
						
		arrayList.add( 3  );
		arrayList.add( 6  );
		arrayList.add( 12 );
		arrayList.add( 15 );
		
		arrayList.add( 2, 9 ); // an dritter Stelle die 9 einfügen
		arrayList.remove( Integer.valueOf( 15 ) );
	
		System.out.println( arrayList );
	}
}
