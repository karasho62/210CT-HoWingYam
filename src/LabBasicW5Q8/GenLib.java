package LabBasicW5Q8;

/**
 * Title:   	GenLib
 * Description:	Provides class methods to generate different values
 *				such as int (integer) and names.
 * Company:		ICT IVE(TY)
 * @author      Patrick Tong
 */
public abstract class GenLib {
//
//	/**
//	 * Randomly generate an integer between start and end inclusively.
//	 * if start larger than end, the two values will be swapped.
//	 * @param start the start value of the random number
//	 * @param end the end value of the random number
//	 * @return an <code>int</code> specifying the random value between the start and end.
//	 */
//	public static int genInt(int start, int end) {
//		if (start > end) {
//			int temp = start;
//			start = end;
//			end = temp;
//		}
//		return ( (int)(Math.random() * (end - start + 1)) + start );
//	}
//
//	/**
//	 * Randomly generate a name string from an internal array.
//	 * @return an <code>String</code> specifying a name string in the interanl array.
//	 */
//	public static String genName() {
//		String names[] = {
//							"Peter", "Donald", "Caleb", "Alan", "Billy",
//							"Mary", "Fred", "Monde", "Stephen", "Diana",
//							"Bruce", "Edward", "Fanny", "Gilbert", "Henry",
//							"Paul", "Eugene", "Susan", "Leon", "Timothy"
//						 };
//		return ( names[genInt(0, names.length-1)] );
//	}
//
//	/**
//	 * Randomly generate a name string from an external array - names.
//	 * @param names an array of name strings
//	 * @return an <code>String</code> specifying a name string.
//	 */
//	public static String genName(String[] names) {
//		return ( names[genInt(0, names.length-1)] );
//	}

} // class GenLib