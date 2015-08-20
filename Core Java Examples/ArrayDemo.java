 class ArrayDemo  {
	int intNumbers[];
	ArrayDemo(int i) {
		intNumbers = new int[i];
	}
	void populateArray() {	
 		for(int i = 0; i < intNumbers.length; ++i) {
			intNumbers[i] = i*10;
		}
	}
	void displayContents() {
		for(int i = 0; i <intNumbers.length; ++i) {
			System.out.println("Number " + i + ": " + intNumbers[i]);
		}
	}
	public static void main(String[] args) 	{
	        //Accepting array length as command line argument.
        int intArg =3; //Integer.parseInt(args[0]);
		ArrayDemo ad = new ArrayDemo(intArg);
		ad.displayContents();
		ad.populateArray();
		ad.displayContents();
	}
} 