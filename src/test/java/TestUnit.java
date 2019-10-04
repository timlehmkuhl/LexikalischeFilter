import org.junit.Test;

import static org.junit.Assert.*;

public class TestUnit {

    @Test
    public void testValidIp() {
        assertTrue(TestIp.isValidIp("122.122.122.122"));
        assertTrue(TestIp.isValidIp("1.2.3.4"));
        assertTrue(TestIp.isValidIp("255.255.45.0"));
        assertFalse(TestIp.isValidIp("600.122.122.122"));
        assertFalse(TestIp.isValidIp("155.256.122.122"));
    }

    @Test
    public void testValidTime() {
        assertTrue(TestZeit.isValidTime("22:22"));
        assertTrue(TestZeit.isValidTime("00:13"));
        assertTrue(TestZeit.isValidTime("13:37"));
        assertTrue(TestZeit.isValidTime("12:34:56"));
        assertTrue(TestZeit.isValidTime("22:22:22"));
        assertTrue(TestZeit.isValidTime("23:59"));
        assertFalse(TestZeit.isValidTime("23:60"));
        assertFalse(TestZeit.isValidTime("24:15"));
    }
}
