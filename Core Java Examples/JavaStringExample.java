public class JavaStringExample{
	public static void main(String args[]){
		/*  String in java represents the character sequence.  */   
		/* creates new empty string */  
		String str1 = new String("");   
		
		/* creates new string object whose content would be Hello World */ 
		String str2 = new String("Hello world");   
		
		/* creates new string object whose 
		 content would be Hello World */  
		String str3 = "Hello world";   
		
		/*   IMPORTANT : Difference between above given two approaches is, string object   
		 created using new operator will always return new string ojbect.  
		 While the other may return the reference of 
		 already created string   
		 ojbect with same content , if any.  */   
		System.out.println( str1.length()); 
		
		//String Object Comparison
		if(str2==str3)
			System.out.println("String objects are same.");
		else
			System.out.println("String objects are different.");
		
		//String contents comparison
		if(str2.equals(str3))
			System.out.println("String contents are same.");
		else
			System.out.println("String contents are different.");
		
		//Other string creation methods
		byte[] bytes = {42, 94, 6, 8};
    	char[] characters = {'a', 'b', 'C', 'D'};
    	String byteStr = new String(bytes);   
    	String charStr = new String(characters); 
    	
    	System.out.println("byteStr : "+byteStr);
    	System.out.println("charStr : "+charStr);
    	



		
	} 
}