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
    public void sortList() {  
        Node current = head, index = null;  
        int temp;  
          
        if(head == null) {  
            return;  
        }  
        else {  
            while(current != null) {  
                index = current.next;  
                while(index != null) {    
                    if(current.data > index.data) {  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                    }  
                    index = index.next;  
                }  
                current = current.next;  
            }      
        }  
    }  
    
	
	public void printlist()
	{
		Node temp = head;
        System.out.print("The students are seated in the order: ");
		while (temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
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
        l.sortList();
		l.printlist();
		sc.close();
	}
}