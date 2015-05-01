
class ProtoString implements ProtoInterface {
	  private String kernev�rdi;
	  
	  public ProtoString( ProtoString input ) {
	    set( input.kernev�rdi );
	  }
	  
	  public ProtoString(String input) {
		set(input);
	  }

	  public void set( String input ) {
	    kernev�rdi = input;
	  }
	  
	  public String toString() {
	    return "ProtoString: v�rdi = " + kernev�rdi;
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