package org.my.utils.message.creators;

import junit.framework.TestCase;
import org.junit.Test;

public class FileMessageCreatorTest extends TestCase {
    @Test
    public void testCreateMessage() {

        String pathToFile = "src/main/resources/message_template.txt";

        String actualResult = "From: Jon Doe\n" +
                "To: Jim Lim\n" +
                "Subject: Test Message\n" +
                "Text: Hello World";

        String result = FileMessageCreator.createTextMessage(pathToFile);
        assertEquals(actualResult, result);
    }

}