import java.util.*;
public class RemoveAdjacentDuplicates 
{ 
	static String rutil(String str, char last) 
    { 
           if (str.length() == 0 || str.length() == 1) 
               return str;
           if (str.charAt(0) == str.charAt(1)) 
           { 
               last = str.charAt(0); 
               while (str.length() > 1 && str.charAt(0) == str.charAt(1)) 
                     str = str.substring(1, str.length()); 
               str = str.substring(1, str.length()); 
               return rutil(str, last);  
           }
           String rem_str = rutil(str.substring(1,str.length()), last);
           if (rem_str.length() != 0 && rem_str.charAt(0) == str.charAt(0)) 
           { 
              last = str.charAt(0); 
              return rem_str.substring(1,rem_str.length());  
           }   
           if (rem_str.length() == 0 && last == str.charAt(0)) 
               return rem_str; 
           return (str.charAt(0) + rem_str); 
    } 
 
    static String rem(String str)   
    { 
           char last = '\0'; 
           return rutil(str, last);        
    } 

    public static void main(String args[]) 
    { 
    	   Scanner sc=new Scanner(System.in);
           String str1=sc.next(); 
           System.out.println(rem(str1)); 
           sc.close();
    } 

}
