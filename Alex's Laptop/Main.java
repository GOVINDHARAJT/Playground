// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier

//Main class to control all other classes
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    String brand;
    String processor;
    String os;
    int range;
    int ram;
    Scanner sc=new Scanner(System.in);
    brand=sc.nextLine();
    processor=sc.nextLine();
    os=sc.next();
    range=sc.nextInt();
    ram=sc.nextInt();
    if(range>0 && ram>0) {
    	System.out.println("Laptop Details");
      	System.out.println("Laptop Brand: "+brand);
      	System.out.println("Processor Name: "+processor);
      	System.out.println("OS: "+os);
      	System.out.println("Processor Range: "+range+" bit");
      	System.out.println("Ram: "+ram+" GB");
    }
    else
      System.out.println("Invalid Input");
  }
}