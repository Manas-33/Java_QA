package f3.Queues;

public class QueueArray {
    private int[] data;
    private int front;
    private int rear;
    private int size;

    public QueueArray()
    {
        data = new int[5];
        front=-1;
        rear=-1;
    }

    public QueueArray(int capacity)
    {
        data = new int[capacity];
        front=-1;
        rear=-1;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size==0;
    }
    //Without circular queue
//    public void enqueue (int elem) throws QueueFullException
//    {
//        if(size== data.length)
//        {
//            throw new QueueFullException();
//        }
//        if(size==0)
//        {
//            front=0;
//        }
//        rear++;
//        data[rear]=elem;
//        size++;
//    }
//
//    public int dequeue() throws QueueEmptyException
//    {
//        if(size==0)
//        {
//            throw new QueueEmptyException();
//        }
//        int temp =data[front];
//        front++;
//        size--;
//        if(size==0)
//        {
//            front=-1;
//            rear=-1;
//        }
//        return temp;
//
//    }

//    //With Circular queue
//    public void enqueue (int elem) throws QueueFullException
//    {
//        if(size== data.length)
//        {
//            throw new QueueFullException();
//        }
//        if(size==0)
//        {
//            front=0;
//        }
////        rear++;
////        if(rear==data.length){
////            rear=0;
////        }
//        //or we can also use
//        rear=(rear+1)%data.length;
//        data[rear]=elem;
//        size++;
//    }

    public void enqueue (int elem)
    {
        if(size== data.length)
        {
            doubleCapacity();
        }
        if(size==0)
        {
            front=0;
        }
//        rear++;
//        if(rear==data.length){
//            rear=0;
//        }
        //or we can also use
        rear=(rear+1)%data.length;
        data[rear]=elem;
        size++;
    }

    public int dequeue() throws QueueEmptyException
    {
        if(size==0)
        {
            throw new QueueEmptyException();
        }
        int temp =data[front];
//        front++;
        front=(front+1)% data.length;
        size--;
        if(size==0)
        {
            front=-1;
            rear=-1;
        }
        return temp;

    }

    public void doubleCapacity()
    {
        int temp[]=data;
        data=new int[2* temp.length];
        int index=0;
        for (int i = front; i <temp.length ; i++) {
            data[index++]=temp[i];
        }
        for (int i = 0; i <front-1 ; i++) {
            data[index++]=temp[i];
        }
        front=0;
        rear= temp.length-1;
    }
    public int front () throws QueueEmptyException
    {
        if(size==0)
        {
            throw new QueueEmptyException();
        }
        return data[front];
    }


}
