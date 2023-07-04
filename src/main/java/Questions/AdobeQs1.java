package Questions;
import java.util.*;
public class AdobeQs1 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);  
        //creates an array in the memory of length 10  
        String str = sc.nextLine();  
         String[] arr=str.split(" ");
         HashMap<String, Integer> map=new HashMap();
         for(String str1:arr)
         {Integer count=map.get(str1);
         if(count==null)
          {map.put(str1,1);}
          else{
              map.put(str1,count+1);
          }
         }
        
        Iterator<String> iter=map.keySet().iterator();
        ArrayList<Node> strArr=new ArrayList();
          int count=0;
          
         while(iter.hasNext())
         {
             String key=iter.next();
             Node node=new Node();
             node.key=key;
             node.count=map.get(key);
             count+=node.count;
             strArr.add(node);
         } 
         Collections.sort(strArr);
      System.out.println(strArr.size());
      for(Node node:strArr)
      {
          System.out.println(node.key+" "+node.count);
      }
    }
    static class Node implements Comparable{
       String key;
       int count;
       @Override
       public int compareTo(Object o) {
           // TODO Auto-generated method stub
          
        return key.compareTo(((Node)o).key);
       } 
    }
}