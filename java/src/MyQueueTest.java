import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyQueueTest {
    @Test
    public void isQueueEmpty(){
        MyQueue queue = new MyQueue(5);
        assertEquals(0, queue.getSize());
    }

    @Test
    public void testEnqueue(){
        MyQueue queue = new MyQueue(5);
        queue.enqueue(10);
        assertEquals(1, queue.getSize());
    }

    @Test
    public void testDequeue(){
        MyQueue queue = new MyQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        int elm = queue.dequeue();
        assertEquals(10, elm);
    }
}
