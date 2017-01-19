import java.lang.String;
import java.lang.StringBuffer;

public class Alltrim
 {
  StringBuffer s1;
  int i;
  int len;

  public StringBuffer Ltrim(StringBuffer s1)
   {
    for(i=0;i<s1.length();i++) 
    {
     if(s1.charAt(i)!=' ')
     {
      s1=s1.delete(0,i);
      break;
     }
   
    } 
     return s1;
   }

 public StringBuffer Rtrim(StringBuffer s1)
 {

   len=s1.length(); 
   for(int i=len-1;i>0;i--)
    {
     if(s1.charAt(i)!='_')
     {
     s1=s1.delete(i+1,len);
     break;
     }    
    } 
  return s1;
 }
 
public static void main(String... s)
 {
   StringBuffer s1=new StringBuffer("    Tanishk Gupta   ");
   Alltrim ob=new Alltrim();  

   s1=ob.Ltrim(s1);
   s1=ob.Rtrim(s1); 
   System.out.println(s1);
 }  

}