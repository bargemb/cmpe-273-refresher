public class MyQueue {

    int array[];
    int front, rear;

    public MyQueue(int size){
        front = 0;
        rear = 0;
        array = new int[size];
    }
    void enqueue(int elem){
        //TODO What if queue is full
        this.array[this.rear++] = elem;
    }
    int dequeue(){
        //TODO What if queue is empty
        int elem = this.array[this.front++];
        return elem;
    }
    int getSize(){
        return rear - front;
    }
}