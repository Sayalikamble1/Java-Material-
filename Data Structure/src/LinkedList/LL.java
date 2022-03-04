package LinkedList;

class Node
{
	int data;
	Node next;
}

class linkedlist
{
	Node head;
	Node tail;
	public void insertAtEnd(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next =  node;
		}
	}
	public void show()
	{
		Node node = head;
		
		while(node.next!=null)
		{
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println(node.data);
	
    }
		
		public void insertAtStart(int data)
		{
			Node node = new Node();
			node.data = data;
			node.next = null;
			node.next = head;
			head = node;
		}
		
    
    
    public void insertAt(int index,int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index==0)
		{
			insertAtStart(data);
		}
		else{
		Node n = head;
		for(int i=0;i<index-1;i++)
		{
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
		}
	}
    public int countNodes() 
    {    
        int count = 0;    
        
        Node current = head;    
            
        while(current != null) 
        {        
            count++;    
            current = current.next;    
        }    
        return count;    
    }   
    public void reverse(Node current)
    {  
        
        if(head == null)
        {  
            System.out.println("List is empty");  
            return;  
        }  
        else 
        {  
           
            if(current.next == null) 
            {  
                System.out.print(current.data + " ");  
                return;  
            }  
              
            reverse(current.next);  
            System.out.print(current.data + " ");  
        }  
    } 
    public void deleteFromStart() 
    {  
    	  
        
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else 
        {    
            if(head != tail) 
            {  
                head = head.next;  
            }  
            
            else 
            {  
                head = tail = null;  
            }  
        }  
    }  
    public void deleteAt(int index)
	{
		if(index==0)
		{
			head = head.next;
		}
		else
		{
			Node n = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++)
			{
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
		
			n1 = null;
		}
	}
    void delete(int key)

    {
   Node temp = head, prev = null;
   
   if (temp != null && temp.data == key) 
   {

    head = temp.next; 
    return;

    }

   
    while (temp != null && temp.data != key) {

    prev = temp;

    temp = temp.next;

    }
  if (temp == null)

    return;
 prev.next = temp.next;

    }
    public void searchNode(int SearchKey) 
    {  
        Node current = head;  
        int i = 1;  
        boolean flag = false;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else
        {  
            while(current != null) 
            {  
                if(current.data == SearchKey) 
                {  
                    flag = true;  
                    break;  
                }  
                i++;  
                current = current.next;  
            }  
        }  
        if(flag)  
             System.out.println("Element is present in the list at the position : " + i);  
        else  
             System.out.println("Element is not present in the list");  
    } 
    }

class LL
{
public static void main(String args[])
{
	linkedlist list = new linkedlist();
	System.out.print("Elements in the list :");
	list.insertAtEnd(5);
	list.insertAtEnd(18);
	list.insertAtEnd(45);
	list.insertAtStart(15);
	list.insertAt(2, 25);
	list.show();
	System.out.println("Count of nodes present in the list: " + list.countNodes()); 
    System.out.print("Reversed List: ");   
    list.reverse(list.head);
    list.deleteFromStart();
    System.out.println("");
    System.out.print("After Deletion from start Elements are :");
    list.show();
    list.searchNode(25);
    System.out.print("After Deletion from end Elements are : "); 
    list.delete(45);  
    list.show();  
     
    
    
    
 } 

    
}

