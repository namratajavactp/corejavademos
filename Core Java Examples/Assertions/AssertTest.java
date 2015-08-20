class AssertTest {
	public static void main(String[] args) {
		// The following assert statement will stop execution
		// with a message if assertions are turned on.
		assert false : "Assertions are turned on.";

		// The following statement will only be printed if 
		// assertions are turned off because  assertions
		// were not allowed at run time by the -ea parameter.
		System.out.println("Assertions are not active.");
	}
}
