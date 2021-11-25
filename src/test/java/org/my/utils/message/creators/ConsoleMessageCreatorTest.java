package org.my.utils.message.creators;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class ConsoleMessageCreatorTest extends TestCase {

    @Test
    public void testCreateMessage() {

        String template = "From: #{from}\n" +
                "To: #{to}\n" +
                "Subject: #{subject}\n" +
                "Text: #{text}";


        System.setIn(new ByteArrayInputStream(template.getBytes()));

        String actualResult = "From: Jon Doe\n" +
                "To: Jim Lim\n" +
                "Subject: Test Message\n" +
                "Text: Hello World";

        String result = ConsoleMessageCreator.createTextMessageT();
        assertEquals(actualResult, result);
    }

}