package org.my.utils.message;

import junit.framework.TestCase;
import org.junit.Test;
import org.my.exceptions.TemplateException;

public class TemplateCheckerTest extends TestCase {

    @Test
    public void testTemplateCorrect() {
        String template = "From: #{from}\n" +
                "To: #{to}\n" +
                "Subject: #{subject}\n" +
                "Text: #{text}";
        try {
            assertTrue(TemplateChecker.isMessageCorrect(template));
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }

}