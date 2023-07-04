package Test;

import java.util.Scanner;

public class TestJavaNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java Test");
		int test_no = takeIntInputFromConsole();
		Boolean is_prime = findPrimeNo(test_no);
		if(is_prime) System.out.println("Given No " + test_no + " is prime");
		else System.out.println("Given No " + test_no + " is not prime");
	}
	
	//Q1 : find no is prime or Not
	public static Boolean findPrimeNo(int no) {
		if(no==1) return false;
		else {
			for(int i=2; i<no/2;i++) {
				if(no % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	//takeIntInputFromConsole
	public static Integer takeIntInputFromConsole() {
		int input_integer;
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter the integer: ");  
		input_integer = sc.nextInt();
		System.out.print("Int Input from console Is: ");
		System.out.println(input_integer);
		System.out.println("---------------------------");
		sc.close();
		return input_integer;
	}

}
