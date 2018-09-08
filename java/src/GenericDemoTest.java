import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericDemoTest {

    @Test
    void get() {
        GenericDemo<String> str = new GenericDemo<String>("Hello World!");
        assertEquals("Hello World!", str.get());
    }
}