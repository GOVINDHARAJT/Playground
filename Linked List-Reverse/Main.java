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
	public void insert_at_end(int x)
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
    public void reverseList()
    {
       Node previous = null;
		Node current = head;
		Node next;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
    }
	
	public void printlist()
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
        System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Main l = new Main();
		while(true)
		{
			int element = sc.nextInt();
          	if(element==-1) break;
			l.insert_at_end(element);
		}
        System.out.print("The students are seated in the order: ");
        l.printlist();
        l.reverseList();
        System.out.print("After reversing the students are seated in the order: ");
		l.printlist();
		sc.close();
	}
}