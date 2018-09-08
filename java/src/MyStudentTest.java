import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MyStudentTest {
    @Test
    void verifySize(){
        ArrayList<MyStudent> studentRecords = new ArrayList<MyStudent>();
        studentRecords.add(new MyStudent("Mayur Barge", 34));
        studentRecords.add(new MyStudent("Shishir Kulkarni", 54));
        assertEquals(2, studentRecords.size());
    }

}