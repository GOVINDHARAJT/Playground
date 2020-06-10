import java.util.Scanner;
public class Main
{
	Node head;
	class Node
	{
		int data;
		Node next;
		
		Node(int n)
		{
			data = n;
			next = null;
		}
		
	}
	public void insert(int x)
	{
		Node new_node = new Node(x);
		Node temp = head;
		if(head == null)
		{
			head = new_node;
		}
		else
		{
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = new_node;
		}
	}
	
	public int Count()
	{
      System.out.println("The students who are present in the class are");
      int Count=0;
		Node temp = head;
		while (temp != null)
		{
          System.out.print(temp.data+" ");
			Count++;
			temp = temp.next;
		}
      System.out.println();
      return Count;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Main l = new Main();
		
	while(true)
		{
			int element = sc.nextInt();
			if(element==-1)
              break;
	l.insert(element);
}
System.out.print("The number of students who are present is "+l.Count()+".");
sc.close();
}
}