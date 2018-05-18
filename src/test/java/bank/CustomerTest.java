package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomerTest {
    Customer cust;
    @BeforeEach
    public void setup(){
        cust = new Customer(1, 123, "MrX");
    }
    @Test
    void testGetId(){
        assertEquals(1, cust.getId());
    }
    @Test
    void testGetName(){
        assertEquals("MrX", cust.getName());
    }
    @Test
    void testSetName(){
        cust.setName("MsY");
        assertEquals("MsY", cust.getName());
    }
    @Test
    void testPinMatch(){
        assertTrue(cust.match(123));
    }
    @Test
    void testPinNoMatch(){
        assertFalse(cust.match(999));
    }
}
