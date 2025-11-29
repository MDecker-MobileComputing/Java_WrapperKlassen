package de.mide.wrapperklassen;

import java.util.ArrayList;

public class ArrayListMitStrings {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main( String[] args ) {
			
		ArrayList arrayList = new ArrayList<>();
		
		arrayList.add( "Alice" );
		arrayList.add( "Bob"   );
		arrayList.add( "Dave"  );
		arrayList.add( "Eve"   );
		
		arrayList.add( 2, "Claire" ); // an dritter Stelle "Claire" einfügen
		arrayList.remove( "Eve" );
		
		
		System.out.println( arrayList );
	}
	
}
