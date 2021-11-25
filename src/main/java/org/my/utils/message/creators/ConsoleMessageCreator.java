package org.my.utils.message.creators;

import org.my.entity.Message;
import org.my.exceptions.TemplateException;
import org.my.utils.console.ConsoleMessageReader;
import org.my.utils.message.MessageBuilder;
import org.my.utils.message.TemplateChecker;

public class ConsoleMessageCreator {

    /**
     * Creates a message from the data entered from the console, used for manual startup
     *
     * @return text message
     */
    public static String createTextMessage() {

        String consoleTemplate = ConsoleMessageReader.readMessage();
        try {
            TemplateChecker.isMessageCorrect(consoleTemplate);

            return new MessageBuilder(consoleTemplate).createMessage(new Message());

        } catch (TemplateException e) {
            e.printStackTrace();
        }
        return "";

    }

    /**
     * Creates a message from the data entered from the console, used during the test run
     *
     * @return text message
     */
    public static String createTextMessageT() {

        String consoleTemplate = ConsoleMessageReader.readMessageT();
        try {
            TemplateChecker.isMessageCorrect(consoleTemplate);
            return new MessageBuilder(consoleTemplate).createMessage(new Message());

        } catch (TemplateException e) {
            e.printStackTrace();
        }
        return "";

    }

}
