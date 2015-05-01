class ProtoTest {

  public static void main( String argv[] ) {
    
    ProtoInterface proto1 = new ProtoInt( 5 );
    ProtoInterface proto2 = new ProtoString( "teststring" );
    
    Klient klient1 = new Klient( proto1 );
    Klient klient2 = new Klient( proto2 );
    
    klient1.handling();
    klient2.handling();
    
    System.out.println( "Klient1 = " + proto1 );
    System.out.println( "Klient2 = " + proto2 );
  }
}