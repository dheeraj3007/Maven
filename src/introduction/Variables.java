package introduction;

import java.nio.file.spi.FileSystemProvider;

public class Variables {// class name is alwayes in upper case 

	public static void main(String[] args) {
		
		String multipalchar;
		multipalchar = "Name";
		System.out.println("infomation:" + multipalchar);
		
		//this are the primitive data types
	
		/*
		 * byte -128 to 127
		 */
		byte byteVariable = 100;
		System.out.println("byte value:" + byteVariable);
		
		
		/*
		 * short -32768 to 32767
		 */
		short shortVariable = 1000;
		System.out.println("short value:" + shortVariable);
		
		/*
		 * integer -214748648 to 2147483647
		 */
		int intVariable = 1000000;
	    System.out.println("int value :" + intVariable);
	    
	    /*
	     * long -2^63to 2^63
	     */		
		long longVariable = 100000L;
		System.out.println("long value :" + longVariable);
		
		/*
		 * Float 0.0f
		 */
		float floatVariable =99.99999f;
		System.out.println("float value:" + floatVariable);
		
		/*
		 * double 0.0d
		 */
		double doubleVariable = 0.01;
		System.out.println("double value:" + doubleVariable );
		
		/*
		 * boolean true or false
		 */
		boolean booleanVariable = true;
		System.out.println("boolean value:" + booleanVariable);
		
		/*
		 * char 0 to65535
		 */
		char charVaribale = 'a';
		System.out.println("char value:" + charVaribale);
		
		
	}

}
