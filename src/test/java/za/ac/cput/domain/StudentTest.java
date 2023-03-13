package za.ac.cput.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student student;

    @BeforeEach
    void setUp(){
        student = new Student(
                "Den",
                "Dover",
                "210075623",
                "benDover@gmail.com");
    }

    // Testing object equality
    @Test
    void testStudentNumberIsEqual() { assertEquals("210075623", student.getStudentNumber());}

    // Testing object identity
    @Test
    void testEmailIsIdentical() { assertSame("benDover@gmail.com", student.getEmail());}

    // Testing failing test
    @Test
    void testStudentIsNull() { assertNull(student);}

    // Testing timeouts
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testTimeout() {
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 11; i++) {
            System.out.println(i);
        };
        long endTime = System.currentTimeMillis();

        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }

    // Testing Disable tests
    @Disabled
    @Test
    void testDisableTest() {assertEquals("Ben Dover", student.getFirstName() + "" + student.getLastName());}
}