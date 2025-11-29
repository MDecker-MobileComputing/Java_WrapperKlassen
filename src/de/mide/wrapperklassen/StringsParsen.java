package de.mide.wrapperklassen;

public class StringsParsen {

	public static void main( String[] args ) {
		
		System.out.println();
		
		double wertDouble = Double.parseDouble( "3.14" );
		System.out.println( wertDouble * 2 );
		
		int wertInt = Integer.parseInt( "123" );
		System.out.println( wertInt * 2 );
		
		int wertShort = Short.parseShort( "12" );
		System.out.println( wertShort * 2 );
		
		boolean wertBool = Boolean.parseBoolean( "true" );
		System.out.println( wertBool == false );
		
		System.out.println();
	}
	
}
