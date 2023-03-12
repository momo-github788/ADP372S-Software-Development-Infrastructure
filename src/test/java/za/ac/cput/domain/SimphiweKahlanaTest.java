/*
* SimphiweKahlanaTest.java
* This is my tdd test class
* author : Simphiwe Kahlana (220162891)
* 10 March 2023
* */

package za.ac.cput.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

class SimphiweKahlanaTest {
    private SimphiweKahlana converter1;
    private SimphiweKahlana converter2;
    private SimphiweKahlana converter3;
    private SimphiweKahlana converter4;

    @BeforeEach
    void setUp(){
        converter1 = new SimphiweKahlana(10,"CM");
        converter2 = new SimphiweKahlana(10,"CM");
        converter3 = converter1;
        converter4 = new SimphiweKahlana(20,"KM");
    }

    //Testing for object equality.
    @Test
    void testEquality(){
        assertEquals(converter1,converter3);
        assertNotEquals(converter1,converter2);

    }

    //Testing for object identity.
    @Test
    void testIdentity(){
        assertSame(converter1,converter3);
        assertNotSame(converter1,converter2);
    }

    //Failing Test
    @Test
    void failingTest(){

        String str3 = converter1.measurementConverter();
        String str4 = converter2.measurementConverter();
        assertEquals(str3,str4);
        fail("Purposefully failing this test as method for Kilometer conversion has not been created yet");
    }


    //Timeout Test
    @Test
    @Timeout(value = 1000,unit = TimeUnit.MILLISECONDS)   //I set the value to a high number to ensure that the test does not timeout and fail.
    void timeoutTest(){
        String str1 = converter1.measurementConverter();
        String str2 = converter2.measurementConverter();
        assertEquals(str1,str2);

    }

    //Disabling Test
    @Disabled("Disabled as I know it will fail")
    @Test
    void disabledTest(){
        assertEquals(converter1,converter2);
    }
}
