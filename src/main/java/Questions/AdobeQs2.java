package Questions;

import java.util.Scanner;
public class AdobeQs2 {
public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    Scanner sc=new Scanner(System.in);  
    String str = sc.nextLine(); 
    int[] array = new int[26];
    
    for(int i=0; i< str.length(); i++){
       array[ str.charAt(i)-97]+=1;
    } 
    for(int i=0;i<26;i++)
    {
        
        for(int j=0;j<array[i];j++)
        {
            System.out.print((char)(i+97));
        }
    }
    
}
}