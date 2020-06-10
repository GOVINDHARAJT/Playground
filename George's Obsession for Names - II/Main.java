import java.util.*;
public class Main{
  public static void main (String[] args){
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int l = s.length();
    int position;
        int length;
        if (s.length() % 2 == 0)
        {
            position = s.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = s.length() / 2;
            length = 1;
        }
       //System.out.print(s.charAt(0));
       System.out.print(s.charAt(0)+s.substring(position, position + length)+s.charAt(l-1));
  }
}