package org.my.utils.message;

import junit.framework.TestCase;
import org.junit.Test;

public class MessageBuilderTest extends TestCase {
    @Test
    public void testCreateMessage() {
        String template = "From: #{from}\n" +
                "To: #{to}\n" +
                "Subject: #{subject}\n" +
                "Text: #{text}";

        String from = "Jon Doe";
        String to = "Jim Kim";
        String subject = "Test";
        String text = "Hello World";

        String expectedResult = "From: " + from + "\n" +
                "To: " + to + "\n" +
                "Subject: " + subject + "\n" +
                "Text: " + text;
        String actualResult = new MessageBuilder(template).createMessage(from, to, subject, text);

        assertEquals(expectedResult, actualResult);
    }

}