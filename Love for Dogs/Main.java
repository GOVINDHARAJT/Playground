// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier

//Main class to control all other classes
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    String name;
    float weight;
    Integer age;
    String color;
    String breed;
    Scanner sc = new Scanner(System.in);
    name = sc.next();
    weight = sc.nextFloat();
    age = sc.nextInt();
    color = sc.next();
    breed = sc.next();
    if(weight>0 && age>0 && name.matches("^[a-zA-Z]*$")) {
    	System.out.println("Name of the dog: "+name);
      	System.out.println("Weight of the dog: "+weight);
      	System.out.println("Age of the dog: "+age);
      	System.out.println("Color of the dog: "+color);
      	System.out.println("Breed of the dog: "+breed);
    }
    else
      System.out.println("Invalid Input");
  }
}
