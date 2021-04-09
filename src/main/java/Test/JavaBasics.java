package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaBasics {

	public static void main(String[] args, Object i) {
		// TODO Auto-generated method stub
		System.out.println("Java Test");
		/////////////////////////////////Variables
		
		//Boolean
		Boolean varbool = new Boolean();
		//Integer
		int a = 2;
		int b = 3;
		int sumInt = a+b;
		System.out.println("sumInt=" + sumInt);
		//Long
		LongInteger varlongInt = 22222222222;
		//Float
		Float varfloat = 1.2;
		//Double
		double aa = 1.2;
		double bb = 1.3;
		double sumDouble = aa + bb;
		System.out.println("sumDouble=" + sumDouble);
		//String
		String fname = "Ankita";
		String lname = "Agrawal";
		String fullname = fname.concat(lname);
		System.out.println("fullname=" + fullname);
		//String Builder
		String strName = new String("Ankita Ag");
		//String Buffer
		StringBuffer sb = new StringBuffer("TestBuffer");
		sb.append("testBufferPrefix");//mutable
		//Arrays
		int[] bookingArr = new int[10];
		int[] ppArr = {11,12,13};
		int ii=0;
		for(int bp: ppArr)//Enhanced for loop Check
		{
			System.out.println(b);
		}
		//ArrayList
		ArrayList arList = new ArrayList();
		//////////////////////////////////////Wrapper Classes - PrimitiveDataTypes
		///Integer, Double, Character, Boolean
		Integer IntWrapper = new Integer(33);
		Double DoubleWrapper = new Double(33.344);
		Character CharacterWrapper = new Character('a');
		Boolean BooleanWrapper = new Boolean(true);
		Integer AutoBoxingTest = 3;
		Integer BoxingTest = new Integer(33);
		int iVal = BoxingTest.intValue();//Unboxing
		
		//////////////////////////////////////Taking Input
		Scanner sc = new Scanner(System.in);
		int[] booking = new int[10];
		int[] pp = { 11,12,13};
		
		////////////////////////////////////Calendar
		
		////////////////////////////////////LocalDate
		
		////////////////////////////////////LocalTime
		
		///////////////////////////////////Enums
		
		///////////////////////////////////////For Loop
		for(int i=0;i<=5;i++)
		{
			System.out.println("in for loop");
		}
		//Enhanced for loop

		
	}

}
