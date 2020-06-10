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
      File myObj = new File(s);//("C:\\Users\\USER\\ProGrad.txt");  
      if (myObj.createNewFile()) {  
       System.out.println("File created");   
      } else {  
        System.out.println("File already exists");  
      }  
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }
  }
}
