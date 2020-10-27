package LabBasicW2Q3;
public abstract class GenLib {

	public static int genInt(int start, int end) {
		if (start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		return ( (int)(Math.random() * (end - start + 1)) + start );
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.print(genInt(1, 100) + " ");
		System.out.println();
		for (int i = 0; i < 10; i++)
			System.out.print(genInt(-10, 10) + " ");
		System.out.println();
		System.exit(0);
	}

} // class GenLib