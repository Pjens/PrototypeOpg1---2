
class ProtoInt implements ProtoInterface {
	  	private int kerneværdi;
	  
	  	public ProtoInt(int v) {
	  		set(v);
	  	}
	  	
	  	public ProtoInt( ProtoInt p ) {
		    set( p.kerneværdi );
	  	}
	  
	  	public void set( int v ) {
	  		kerneværdi = v;
	  	}
	  
	  	public String toString() {
	  		return "ProtoInt: værdi = " + kerneværdi;
	  	}
	  
	  	@Override
	  	public ProtoInterface Clone() {
	  		return new ProtoInt( this );
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