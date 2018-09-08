import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMultithreadTest {

    @Test
    void multiply() {
        MyMultithread thread = new MyMultithread(5, 6);
        assertEquals(30, thread.multiply());
    }

}