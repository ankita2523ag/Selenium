package Test;

import java.util.Scanner;

public class TakeInputInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		takeIntArrayInputFromConsole();
		//takeStringArrayInputFromConsole();
		//takeIntInputFromConsole();
		//takeStringInputFromConsole();
	}
	
	//takeIntArrayInputFromConsole
		public static int[] takeIntArrayInputFromConsole() {
			int n;  
			Scanner sc=new Scanner(System.in);  
			System.out.print("Enter the number of elements you want to store: ");  
			//reading the number of elements from the that we want to enter  
			n=sc.nextInt();  
			//creates an array in the memory of length 10  
			int[] array = new int[n];  
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<n; i++)  
			{  
			//reading array elements from the user   
				array[i]=sc.nextInt();  
			}  
			sc.close();
			System.out.print("Array Input from console Is:");
			for(int x:array) {
				System.out.print(x+" ");
			}
			System.out.println();
			System.out.println("---------------------------");
			return array;
		}
		
		//takeIntArrayInputFromConsole
			public static String[] takeStringArrayInputFromConsole() {
				int n;  
				Scanner sc=new Scanner(System.in);  
				System.out.print("Enter the number of elements you want to store: ");  
				//reading the number of elements from the that we want to enter  
				n=sc.nextInt();  
				//creates an array in the memory of length 10  
				String[] array = new String[n];  
				System.out.println("Enter the elements of the array: ");  
				for(int i=0; i<n; i++)  
				{  
				//reading array elements from the user   
					array[i]=sc.nextLine();  
				}  
				sc.close();
				System.out.print("Array Input from console Is:");
				for(String x:array) {
					System.out.print(x+" ");
				}
				System.out.println();
				System.out.println("---------------------------");
				return array;
			}
		
		//takeIntInputFromConsole
		public static Integer takeIntInputFromConsole() {
			int input_integer;
			Scanner sc=new Scanner(System.in);  
			System.out.println("Enter the integer: ");  
			input_integer = sc.nextInt();
			System.out.print("Int Input from console Is:");
			System.out.println(input_integer);
			System.out.println("---------------------------");
			return input_integer;
		}
		
		//takeStringInputFromConsole
		public static String takeStringInputFromConsole() {
			String input_string = "";
			Scanner sc=new Scanner(System.in);  
			System.out.println("Enter the String: ");  
			input_string = sc.nextLine();
			System.out.print("String Input from console Is:");
			System.out.println(input_string);
			System.out.println("---------------------------");
			return input_string;
		}
}
