package za.ac.cput.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @BeforeEach
    void setup() {
        Product product = new Product("219090912", "Paper", 499.99,100 );
    }


    //Testing objects Equality
    @Test
    void testProductIdIsEqual() {
        assertEquals("219090912", Product.getId());
    }

    //Testing objects Identity
    @Test
    void testProductDescriptionIsIdentical() {
        assertSame("Paper", Product.getDescription());
    }

    //Testing failing test
    @Test
    void testProductIsNull() {Object product = null; assertNull(null);}

    //Testing timeouts
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testTimeout(){
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        };
        long endTime = System.currentTimeMillis();

        System.out.println("That took " + (endTime - startTime) + " milliseconds");

    }


    //Disabling
    @Disabled
    @Test
    void testDisableTest(){assertEquals("219090912 Paper", Product.getId() + " " + Product.getDescription()); }
}