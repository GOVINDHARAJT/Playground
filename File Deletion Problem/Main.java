// import the respective packages
import java.io.File; 
import java.io.IOException;
import java.util.*;
public class Main{
  public static void main (String[] args){
    //Try out your code here
     try {  
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
      File myObj = new File(s);  
       myObj.createNewFile();
      if (myObj.delete()) {  
       System.out.println("File was not deleted");   
      } else {  
        System.out.println("File deleted");  
      }  
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
