
class ProtoInt implements ProtoInterface {
	  	private int kernev�rdi;
	  
	  	public ProtoInt(int v) {
	  		set(v);
	  	}
	  	
	  	public ProtoInt( ProtoInt p ) {
		    set( p.kernev�rdi );
	  	}
	  
	  	public void set( int v ) {
	  		kernev�rdi = v;
	  	}
	  
	  	public String toString() {
	  		return "ProtoInt: v�rdi = " + kernev�rdi;
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