import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class MyStackTest {
    @Test
    void isStackEmpty(){
        MyStack stack = new MyStack(5);
        assertEquals(0, stack.getSize());
    }

    @Test
    void testPush(){
        MyStack stack = new MyStack(5);
        stack.push(10);
        assertEquals(1, stack.getSize());
    }

    @Test
    void testPop(){
        MyStack stack = new MyStack(5);
        stack.push(12);
        stack.push(24);
        assertEquals(24, stack.pop());
    }
}
