package org.my.utils.message.creators;

import org.my.entity.Message;
import org.my.exceptions.TemplateException;
import org.my.messenger.reader.FileReader;
import org.my.utils.message.MessageBuilder;
import org.my.utils.message.TemplateChecker;

public class FileMessageCreator {
    public static String createTextMessage(String path) {
        String template = new FileReader().read(path);

        try {
            TemplateChecker.isMessageCorrect(template);
            return new MessageBuilder(template).createMessage(new Message());

        } catch (TemplateException e) {
            e.printStackTrace();
        }
        return "";
    }
}
