class Base  {
	final void print()    {
		System.out.println("Base");    
	}  
}
class finalmethod extends Base  {
	void print()    {
		System.out.println("Derived");    
	}
	public static void main(String args[]){
		Base obj = new Overriding();
		obj.print(); 	// "Derived" is printed 	    }  }
	}
}