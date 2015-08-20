import java.util.*;
public class SystemProperties {
    private static void setGetSystemProperty() {
        System.out.println();
        System.out.println("+-------------------------+");
        System.out.println("| SET SYSTEM PROPERTIES   |");
        System.out.println("+-------------------------+");

        System.out.println();
        System.out.println("  -----------------------");
        System.out.println("  Setting System Property");
        System.out.println("  -----------------------");

        System.setProperty("test.value1", "This is test #1");
        System.setProperty("test.value2", "This is test #2");

        System.out.println();
        System.out.println("  ----------------------------");
        System.out.println("  Retrieving System Properties");
        System.out.println("  ----------------------------");
        System.out.println();

        System.out.println("  {test.value1} = " + System.getProperty("test.value1"));
        System.out.println("  {test.value2} = " + System.getProperty("test.value2"));
    }
    private static void querySystemProperties() {
        System.out.println();
        System.out.println("+-------------------------+");
        System.out.println("| QUERY SYSTEM PROPERTIES |");
        System.out.println("+-------------------------+");

        Properties sysProps = System.getProperties();
        System.out.println();
        System.out.println("  ------------------------------------------------");
        System.out.println("  Use list() method to list all property values...");
        System.out.println("  ------------------------------------------------");
        System.out.println();
        
        sysProps.list(System.out);

        System.out.println();
        System.out.println("  ------------------------------------------------");
        System.out.println("  Get Property Names and Enumerate through                               them...");
        System.out.println("  ------------------------------------------------"); System.out.println();
        Enumeration enProps = sysProps.propertyNames();
        String key = "";
        while ( enProps.hasMoreElements() ) {
        	key = (String) enProps.nextElement();
        	System.out.println("  " + key + "  ->  " +   sysProps.getProperty(key));
        }
    }
 /**
* Sole entry point to the class and application.
 * @param args Array of String arguments.
 */
    public static void main(String[] args) {
    	setGetSystemProperty();
    	querySystemProperties();
    }
}







