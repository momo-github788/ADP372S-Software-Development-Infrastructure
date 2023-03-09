package za.ac.cput.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee("220464901", "John", "Doe", "johndoe@gmail.com");
    }

    // Testing object equality
    // assertEquals() makes use of the equals() method to compare values, i'm overriding this method in my POJO class
    @Test
    void testEmployeeIdIsEqual() {
        assertEquals("220464901", employee.getId());
    }

    // Testing object identity
    // assertSame() makes use of the equality operator (==) to compare values
    @Test
    void testEmployeeEmailIsIdentical() {
        assertSame("johndoe@gmail.com", employee.getEmailAddress());
    }

    // Testing failing test
    // In this example, the test EXPECTS the Employee object to be NULL
    // Because the object is initialized and is NOT NULL, the test will fail
    @Test
    void testEmployeeIsNull() {
        assertNull(employee);
    }

    // Testing timeouts
    // Tests if the method executed within the time specified
    // In this example, the test is expected to execute in under 100 milliseconds, else it would fail
    // Because i'm only looping 10 times, it takes almost no time (1ms maybe) to execute the method, so the timeout would PASS
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testTimeout() {
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        };
        long endTime = System.currentTimeMillis();

        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }

    // Testing Disable tests
    @Disabled
    @Test
    void testDisabledTest() {
        assertEquals("John Doe", employee.getFirstName() + " " + employee.getLastName());
    }
}