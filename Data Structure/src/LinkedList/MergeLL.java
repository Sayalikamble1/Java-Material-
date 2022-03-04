package LinkedList;

class MergeLL
{
	 
    static class Node
{
        int data;
        Node next;
    }
     static Node newNode(int key)
    {
        Node temp = new Node();
        temp.data = key;
        temp.next = null;
        return temp;
    }
 
   static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    static Node mergeUtil(Node h1, Node h2)
    {
    
        if (h1.next == null) 
        {
            h1.next = h2;
            return h1;
        }
        
        Node current1 = h1, next1 = h1.next;
        Node current2 = h2, next2 = h2.next;
 
        while (next1 != null && current2 != null) {
        
     if ((current2.data) >= (current1.data) && (current2.data) <= (next1.data)) {
                next2 = current2.next;
                current1.next = current2;
                current2.next = next1;

                current2 = next2;
            }
            else
            {
          
                if (next1.next != null) 
                {
                    next1 = next1.next;
                    current1 = current1.next;
                }
 
                else {
                    next1.next = current2;
                    return h1;
                }
            }
        }
        return h1;
    }

    static Node merge(Node hd1, Node hd2)
    {
        if (hd1 == null)
            return hd2;
        if (hd2 == null)
            return hd1;
 
        if (hd1.data < hd2.data)
            return mergeUtil(hd1, hd2);
        else
            return mergeUtil(hd2, hd1);
    }
 
    public static void main(String[] args)
    {
        
        Node head1 = newNode(4);
        head1.next = newNode(8);
        head1.next.next= newNode(12);
        Node head2 = newNode(1);
        head2.next = newNode(4);
        head2.next.next = newNode(5);
        head2.next.next.next= newNode(9);
 
        Node head = merge(head1, head2);
 
        printList(head);
    }
}