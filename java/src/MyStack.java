public class MyStack {
    int top;
    int array[];

    public MyStack(int size){
        top = -1;
        array = new int[size];
    }
    void push(int elem){
        //TODO What if stack is full
        this.array[++this.top] = elem;
    }
    int pop(){
        //TODO What if stack is empty
        int elem = this.array[this.top--];
        return elem;
    }
    int getSize(){
        return top + 1;
    }
}
