package LinkedList;

class DoublyList
{
	int size;
   class Node
	{
		int data;
		Node prev;
		Node next;
		
		
		public Node(int data)
		{
			this.data=data;
		}
		}
   Node head,tail=null;
   public void CreateNode(int data)
   {
	   Node newNode = new Node(data);
	   
	   if(head == null)
	   {
		   head=tail=newNode; 
		   head.prev=null;
		   tail.next=null;
	   }
	   else
	   {
		   tail.next=newNode;  
		   newNode.prev=tail;
		   tail=newNode;
		   tail.next=null;
		   
	   }
   } 
 
   public void addBegin(int data)
   {  
       Node New = new Node(data);  
         
      
       if(head == null) 
       {  
           
          head = tail = New;  
          head.prev = null;  
          tail.next = null;  
       }  
       
       else 
       {  
           head.prev = New;  
           New.next = head;  
           New.prev = null;  
           head = New;  
       }  
   }  
   
   public void addAtEnd(int data) 
   {  
     
       Node newNode = new Node(data);  
         
    
       if(head == null) 
       {  
       head = tail = newNode;  
      head.prev = null;  
        tail.next = null;  
       }  
        
       else 
       {  
           tail.next = newNode;  
           newNode.prev = tail;  
           tail = newNode;
           tail.next = null;  
       }  
   }  
   public void addInMid(int data) 
   {
	  
        Node newNode = new Node(data);  
  
        
        if(head == null) {  
        
            head = tail = newNode;  
            
            head.prev = null;  
           
            tail.next = null;  
        }  
        else 
        {  
            
            Node current = head, temp = null;  
  
            int mid = (size % 2 == 0) ? (size-1/2) : ((size+1)/2);  
  
         
            for(int i = 1; i < mid; i++)
            {  
                current = current.next;  
            }  
  
           
            temp = current.next;  
            temp.prev = current;  
            current.next = newNode;  
            newNode.prev = current;  
            newNode.next = temp;  
            temp.prev = newNode;  
        }  
        size++;  
    }
   public void AddatPos(int data, int pos) 
   {     
	    Node newNode = new Node(pos); 
	    newNode.data = data;
	    newNode.next = null;
	    newNode.prev = null;
	    if(pos < 1) 
	    {
	      System.out.print("\nposition is less than 1");
	    } 
	    else if (pos == 1) 
	    {
	      newNode.next = head;
	      head.prev = newNode;
	      head = newNode;
	    } 
	    else 
	    {
	      Node temp = new Node(pos);
	      temp = head;
	      for(int i = 1; i < pos-1; i++) 
	      {
	        if(temp != null) 
	        {
	          temp = temp.next;
	        }
	      }
	      if(temp != null) 
	      {
	        newNode.next = temp.next;
	        newNode.prev = temp;
	        temp.next = newNode;  
	        if(newNode.next != null)
	          newNode.next.prev = newNode;
	      } 
	      else 
	      {
	        System.out.print("\nThe previous node is null.");
	      }       
	    }
	  }  

   void deleteNode(int key)

   {
  Node temp = head, prev = null;

if (temp != null && temp.data == key) 
   {

   head = temp.next; 

   return;

   }

   while (temp != null && temp.data != key) 
   {

   prev = temp;

   temp = temp.next;

   }

   if (temp == null)

   return;

   prev.next = temp.next;

   } 
   public int maximumNode() 
   {  
       
       Node current = head;  
       int max;  
       if(head == null) 
       {  
           System.out.println("List is empty");  
           return 0;  
       }  
       else 
       {  
          max = head.data;  
           
           while(current != null) 
           {  
               if(current.data > max)  
                   max = current.data;  
               current = current.next;  
           }  
       }  
       return max;  
   }  
   public void FindNode(int search) 
   {  
       int i = 0;  
       int flag = 0;  
      
       Node current = head;  
      if(head == null) 
      {  
           System.out.println("List is empty");  
           return;  
       }  
       while(current != null) 
       {  
        
           if(current.data == search) 
           {  
               flag = 1;  
               break;  
           }  
           current = current.next;  
           i++; 
       }  
       if(flag == 1)  
            System.out.printf("Node is present in the list at the position  : "  + i);  
       else  
            System.out.println("-1.....i.e Node is not Present");  
   }  
   public void Reverse()
   {
		if(head == null) 
		{
			return;
		}
		
		Node temp = tail;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}
		System.out.println("null");
	}
    
    public void PrintData()
   {
	   Node Current=head;
	   if(head == null)
	   {
		   System.out.println("List is empty");
		   return;
	   }
	   
	   while(Current != null)
	   {
		   System.out.println(Current.data +" ");
		   Current=Current.next;
	   }
	   }
       }
public class DL 
{
public static void main(String[] args) 
{
	DoublyList dl=new DoublyList();
	System.out.println("Nodes of Doubly Linked list :");
	dl.CreateNode(5);
	dl.CreateNode(10);
	dl.CreateNode(15);
	dl.PrintData();
	System.out.println("Nodes after adding at beginning");
	dl.addBegin(0);
    dl.PrintData();
    System.out.println("Nodes after adding at end :");
    dl.addAtEnd(20);
    dl.PrintData();
    System.out.println("Nodes After Addting at given Position");
    dl.AddatPos(33, 3);
    dl.PrintData();
    System.out.println("Nodes after adding at middle :");
    dl.addInMid(100);
    dl.PrintData();
    System.out.println("Nodes after Deletion :");
    dl.deleteNode(10);
    dl.PrintData();
    System.out.println("Maxmimum Node Fom Doubly Linked List is :"+dl.maximumNode());
	dl.FindNode(15);
	System.out.println(" ");
	dl.FindNode(66);
	System.out.print("Reverse :");
	dl.Reverse();
	
}
}
