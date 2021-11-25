package org.my.utils.message;

import org.my.entity.Message;

public class MessageBuilder {
    private String template;

    public MessageBuilder(String template) {
        this.template = template;
    }

    public String createMessage(String from, String to, String subject, String text) {
        return template.replace("#{from}", from)
                .replace("#{to}", to)
                .replace("#{subject}", subject)
                .replace("#{text}", text);


    }

    public String createMessage(Message message) {
        return createMessage(message.getFrom(), message.getTo(), message.getSubject(), message.getText());
    }
}
