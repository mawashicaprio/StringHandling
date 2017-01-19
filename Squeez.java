import java.lang.String;
import java.lang.StringBuffer;

public class Squeez
{ 

 public static void main(String... s)
{
 StringBuffer sb=new StringBuffer("     tANISHK IS A rockstar..      yo  ");
 for(int i=0;i<sb.length();i++)
 {
  if(sb.charAt(i)==' ')
  {
  sb=sb.delete(i,i+1);
  i--;
  }
}
 System.out.println(sb);
}

}