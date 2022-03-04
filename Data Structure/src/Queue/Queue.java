package Queue;

class Que
{
 int Que[]= new int[5];
 int size=0;
 int front=0;
 int rear=0;
 
 public void enqueue(int data)
 {
  if(!isFull())
  {
  Que[rear]=data;
  rear=(rear+1)%5;
  size++;
  }
  else
  {
   //System.out.println("Queue is Full, so elements is now added in circular way");
   Que[rear]=data;
   rear=(rear+1)%5;
                      // don't increase the size here, otherwise it will print more than 5 elements, it will be addding in circular way when                                    
                     //queue will become full
  }
 }
 public void show()
 {
  int i=0;
  System.out.print("Elements :  ");
  for (i = 0; i < size; i++) 
  {
   System.out.print(Que[(front+i)%5]+" ");   
  }
  System.out.println();
  //System.out.println((front+i));
//  for(int n: queue)
//  {
//   System.out.print(n+" ");
//  }
//  System.out.println();
 }
 public int dequeue()
 {
  int data =0;
  if(!isEmpty())
  {
  data = Que[front];
  front=(front+1)%5;
  size--;
  }
  else
  {
   System.out.println("Queue is Empty ");
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
  return getSize()==5;
 }
 }
class Queue
{
	public static void main(String[] args) 
	{
		Que q=new Que();
		q.enqueue(5);
		q.enqueue(18);
		q.enqueue(42);
		q.enqueue(35);
		q.show();
		q.dequeue();
		q.show();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.show();
		q.dequeue();
		q.show();
		
		
	}
}


