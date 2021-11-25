package org.my.messenger.reader;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Properties;

public class TemplateReaderTest extends TestCase {
    @Test
    public void testRead() {

        Properties properties = new Properties();
        properties.put("message.from", "Jon Doe");
        properties.put("message.to", "Jim Lim");
        properties.put("message.subject", "Test Message");
        properties.put("message.text", "Hello World");

        assertEquals(properties, new TemplateReader().read());
    }

}