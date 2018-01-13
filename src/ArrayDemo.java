import java.util.Scanner;

public class ArrayDemo {
	private static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
	
		
		//int [] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] myIntArray = new int[10];
		double [] myDoubleArray = new double [10];
		System.out.println(myIntArray[5]);
		for (int i = 0; i<myIntArray.length; i++) {
			myIntArray[i]=i*10;
			System.out.println("Element "+i+", value is "+myIntArray[i]);
		}
		System.out.println("************");
		
		int[]myIntegers = getIntegers(5);
		for (int i = 0; i<myIntegers.length; i++) {
			System.out.println("Element "+i+", value is "+myIntegers[i]);
		}
	}
	
	public static int [] getIntegers(int number) {
		System.out.println("Enter "+number+"integer values.\r");
		int[]values = new int[number];
		
		for (int i =0; i<values.length; i++) {
			values[i] = sc.nextInt();
		}
		return values;
	}
}
