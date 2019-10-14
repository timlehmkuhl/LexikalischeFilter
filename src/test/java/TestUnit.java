import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class TestUnit {



    @Test
    public void testIP() throws IOException {
        TestIp ip = new TestIp();
        String[] str = {"122.122.122.122", "1.2.3.4", "255.255.45.0"};

        for(String s : str) {
            assertEquals(s, ip.run(s, false));
            assertTrue(ip.isValidIp(s));
        }

        String[] strFalse = {"600.122.122.122", "155.256.122.122", "255.255.945.0"};

        for(String s : strFalse) {
            assertEquals("", ip.run(s, false));
            assertFalse(ip.isValidIp(s));
        }
    }

    @Test
    public void testZeit() throws IOException {
        TestZeit zeit = new TestZeit();
        String[] str = {"22:22", "23:55:11", "23:59:59"};

        for(String s : str) {
            assertEquals(s, zeit.run(s, false));
            assertTrue(zeit.isValidTime(s));
        }

        String[] strFalse = {"99:99:99", "25:59", "12:61"};

        for(String s : strFalse) {
            assertEquals("", zeit.run(s, false));
            assertFalse(zeit.isValidTime(s));
        }
    }
}
