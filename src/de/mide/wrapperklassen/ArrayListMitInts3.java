package de.mide.wrapperklassen;

import java.util.ArrayList;

public class ArrayListMitInts3 {

	/**
	 * Dank Autoboxing werden int-Werte automatisch in {@code Integer}-Objekte überführt.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main( String[] args ) {
		
		System.out.println();
		
		ArrayList arrayList = new ArrayList<>();
						
		arrayList.add( 3  );
		arrayList.add( 6  );
		arrayList.add( 12 );
		arrayList.add( 15 );
		
		arrayList.add( 2, 9 ); 
		arrayList.remove( Integer.valueOf( 15 ) );
	
		System.out.println( arrayList );
		
		System.out.println();
	}
}
