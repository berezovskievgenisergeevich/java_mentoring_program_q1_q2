package org.my.messenger.reader;

import junit.framework.TestCase;
import org.junit.Test;

public class FileReaderTest extends TestCase {

    @Test
    public void testRead() {
        String content = "From: #{from}\n" +
                "To: #{to}\n" +
                "Subject: #{subject}\n" +
                "Text: #{text}";

        String pathToFile = "src/main/resources/message_template.txt";

        assertEquals(content, new FileReader().read(pathToFile));
    }

}