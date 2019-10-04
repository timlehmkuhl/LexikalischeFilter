import org.junit.Test;

import static org.junit.Assert.*;

public class TestUnit {

    @Test
    public void testValidIp() {
        assertTrue(IPTest.isValidIp("122.122.122.122"));
        assertTrue(IPTest.isValidIp("1.2.3.4"));
        assertTrue(IPTest.isValidIp("255.255.45.0"));
        assertFalse(IPTest.isValidIp("600.122.122.122"));
        assertFalse(IPTest.isValidIp("155.256.122.122"));
    }

    @Test
    public void testValidTime() {
        assertTrue(TestTime.isValidTime("22:22"));
        assertTrue(TestTime.isValidTime("00:13"));
        assertTrue(TestTime.isValidTime("13:37"));
        assertTrue(TestTime.isValidTime("12:34:56"));
        assertTrue(TestTime.isValidTime("22:22:22"));
        assertTrue(TestTime.isValidTime("23:59"));
        assertFalse(TestTime.isValidTime("23:60"));
        assertFalse(TestTime.isValidTime("24:15"));
    }
}
