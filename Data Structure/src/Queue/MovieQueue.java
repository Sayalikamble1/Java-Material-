package Queue;

class Mqueue
{
 String Mqueue[]= new String[7];
 int size=0;
 int front=0;
 int rear=0;
 
 public void enqueue(String data)
 {
  if(!isFull())
  {
  Mqueue[rear]=data;
  rear=(rear+1)%7;
  size++;
  }
  else
  {
   Mqueue[rear]=data;
   rear=(rear+1)%7;
                    
  }
 }
 public void show()
 {
  int i=0;
  System.out.print("Persons Which are in Queue for issueing Movie Ticket  :  ");
  for (i = 0; i < size; i++) 
  {
   System.out.print(Mqueue[(front+i)%7]+" ");   
  }
  System.out.println();
 System.out.println();
 }
 public String dequeue()
 {
  String data =null;
  if(!isEmpty())
  {
  data = Mqueue[front];
  front=(front+1)%7;
  size--;
  }
  else
  {
   System.out.println("Nobody is in line ---Queue is empty");
  }
  return data;
 }
 public int getSize()
 {
  return size;
 }
 public boolean isEmpty() 
 {
  return getSize()==0;
 }
 public boolean isFull() 
 {
  return getSize()==7;
 }
 }
class MovieQueue
{
	public static void main(String[] args) 
	{
		Mqueue q=new Mqueue();
		q.enqueue("Sayali");
		q.enqueue("Priti");
		q.enqueue("Pooja");
		q.enqueue("Raj");
		q.enqueue("Ramesh");
		q.enqueue("Sunny");
		q.enqueue("Siya");
		q.show();
		q.dequeue();
		q.show();
		q.dequeue();
		q.show();
		q.dequeue();
		q.show();
		q.dequeue();
		q.show();
		q.dequeue();
		q.show();
		q.dequeue();
		q.show();
		q.dequeue();
		q.show();
		q.dequeue();
		
		
		
	}
}


