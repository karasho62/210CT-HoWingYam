package LabBasicW5Q8;

import javax.swing.JOptionPane;

public abstract class SimpleInput {
//
//	/**
//	 * Returns an integer (int) input from an Input Dialog
//	 * @param prompt a prompt message shown in the dialog box
//	 * @return an <code>int</code> specifying the integer input from user.
//	 */
//	public static int getInteger(String prompt) {
//		do {
//			try {
//				return Integer.parseInt(JOptionPane.showInputDialog(null, prompt));
//			}
//			catch (NumberFormatException nfe) {
//				JOptionPane.showMessageDialog(null, "Invalid integer!");
//			}
//		} while (true);
//	}
//
//	/**
//	 * Returns a floating point number (float) input from an Input Dialog
//	 * @param prompt a prompt message shown in the dialog box
//	 * @return an <code>float</code> specifying the floating point number input from user.
//	 */
//	public static float getFloat(String prompt) {
//		do {
//			try {
//				return Float.parseFloat(JOptionPane.showInputDialog(null, prompt));
//			}
//			catch (NumberFormatException nfe) {
//				JOptionPane.showMessageDialog(null, "Invalid number!");
//			}
//		} while (true);
//	}
//
//	/**
//	 * Returns a string input from an Input Dialog
//	 * @param prompt a prompt message shown in the dialog box
//	 * @return an <code>String</code> specifying the string input from user.
//	 */
//	public static String getString(String prompt) {
//		return JOptionPane.showInputDialog(null, prompt);
//	}
//
//	/**
//	 * Returns a character (char) from an Input Dialog
//	 * @param prompt a prompt message shown in the dialog box
//	 * @return an <code>char</code> specifying the character input from user.
//	 */
//	public static char getChar(String prompt) {
//		String s;
//		do {
//				s = JOptionPane.showInputDialog(null, prompt);
//				if (s.length() == 1)
//					return s.charAt(0);
//			} while (true);
//	}

} // class SimpleInput