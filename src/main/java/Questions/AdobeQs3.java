package Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AdobeQs3 {
public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    Scanner sc=new Scanner(System.in);  
    ArrayList<Integer> arr = new ArrayList();
    while(sc.hasNext())
    {arr.add(Integer.parseInt(sc.nextLine()));}  
    
    int sum = arr.get(arr.size()-1);
    arr.remove(arr.size()-1);
    HashMap<Integer,Integer> map=new HashMap();
    map.put(arr.get(0),arr.get(0));
    for(int i=1;i<arr.size();i++)
    {
       Integer val= map.get(sum-arr.get(i));
     if(val!=null){System.out.println("1");return;} 
     else{
          map.put(arr.get(i),arr.get(i));
     }  
    }
    System.out.println("0");
    //System.out.println(arr);

}
}