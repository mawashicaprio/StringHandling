import java.lang.*;

public class Seqcount
{
  public static void main(String... s)
  {
   StringBuffer sb = new StringBuffer("nniittiiin");
   StringBuffer sb1 = new StringBuffer();
   
   for(int i=0;i<sb.length(); i++)
   {
    int count=1;
    for(int j=i+1; j<sb.length(); j++)
    {
     if(sb.charAt(i)==sb.charAt(j))
     { 
     sb1=sb.delete(j,j+1); 
     count++;
     }  
    }
     System.out.print(sb1.charAt(i));
     System.out.print(count); 
   }
   

  }
 
}