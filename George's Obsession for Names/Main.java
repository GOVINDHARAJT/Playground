import java.util.*;
public class Main{
  public static void main (String[] args){
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    String  s = sc.nextLine();
    String u = s.toUpperCase();
    for(int i=0;i<s.length();i++)
    {
      System.out.println(u.charAt(i));
    }
  }
}