package Test;

import java.util.Scanner;

public class TestJavaString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java Test");
		String test = takeStringInputFromConsole();
		String reverse_test = reverseWord(test);
		System.out.println("Reversed String is---"+reverse_test);

	}
	
	//QA1: String me se word reverse order me print karnatha
	public static String reverseWord(String str) {
		System.out.println("Original String is---" + str);
		String reverseWord="";  
		String words[]=str.split("\\s");  
		System.out.println(words[0]);
		System.out.println(words[1]);
		for(String w:words) {
			  StringBuilder sb=new StringBuilder(w);  
		      sb.reverse();  
		      reverseWord+=sb.toString()+" ";  
		}
		return reverseWord.trim();
	}
	
	//takeStringInputFromConsole
	public static String takeStringInputFromConsole() {
		String input_string = "";
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter the String: ");  
		input_string = sc.nextLine();
		System.out.print("String Input from console Is: ");
		System.out.println(input_string);
		System.out.println("---------------------------");
		return input_string;
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
		System.out.println("Enter the elements of the String array: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
			array[i]=sc.nextLine();  
		}  
		sc.close();
		System.out.print("Array Input from console Is: ");
		for(String x:array) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("---------------------------");
		return array;
	}
	
}
