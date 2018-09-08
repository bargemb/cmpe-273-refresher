import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyInterfaceTest {

    @Test
    void add() {
        MyInterface demo = new MyInterface();
        int answer = demo.add(5, 5);
        assertEquals(10, answer);
    }

    @Test
    void subtract() {
        MyInterface demo = new MyInterface();
        int answer = demo.subtract(5, 5);
        assertEquals(0, answer);
    }
}