package Test;

import java.util.Scanner;

public class TestJavaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//str.charAt(i).tot
		//str.charAt(i).tot
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
		System.out.print("Array Input from console Is: ");
		for(int x:array) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("---------------------------");
		return array;
	}
	

}
