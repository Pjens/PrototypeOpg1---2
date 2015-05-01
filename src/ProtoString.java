
class ProtoString implements ProtoInterface {
	  private String kerneværdi;
	  
	  public ProtoString( ProtoString input ) {
	    set( input.kerneværdi );
	  }
	  
	  public ProtoString(String input) {
		set(input);
	  }

	  public void set( String input ) {
	    kerneværdi = input;
	  }
	  
	  public String toString() {
	    return "ProtoString: værdi = " + kerneværdi;
	  }
	  
	  public ProtoInterface Clone() {
	    return new ProtoString( this );
	  }
	  
	  // opgave 2
	  public Object clone() {
		try {
		  return super.clone();
	  }
		catch ( CloneNotSupportedException e ) {
		  return null;
	  }
  }
}