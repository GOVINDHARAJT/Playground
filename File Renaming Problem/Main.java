import java.io.File; 
import java.io.IOException;
import java.util.*;
public class Main{
  public static void main (String[] args){
    //Try out your code here
     try {  
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       String f = sc.nextLine();
      File myObj = new File(s); 
      File newFile = new File(f);
      if (myObj.renameTo(newFile)) {  
       System.out.println("Renamed successfully");   
      } else {  
        System.out.println("error");  
      }  
    } 
    catch(Exception e) {
      System.out.println(e);
    }
  }
}
