package org.my.messenger.reader;

import junit.framework.TestCase;
import org.junit.Test;
import org.my.utils.console.ConsoleMessageReader;

import java.io.ByteArrayInputStream;

public class ConsoleReaderTest extends TestCase {
    @Test
    public void testRead() {

        String data = "Hello\n1";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        String consoleResult = ConsoleMessageReader.readMessageT();

        assertEquals(data, consoleResult);
    }

}