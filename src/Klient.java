class Klient {
  private ProtoInterface proto;
  
  public Klient( ProtoInterface protointerface ) {
    proto = protointerface;
  }
  
  public void handling() {
    
	ProtoInterface proto1 = proto.Clone();
    ProtoInterface proto2 = proto.Clone();
    
    System.out.println( "Protoclone1: " + proto1 );
    System.out.println( "Protoclone2: " + proto2 ); 
  }
}