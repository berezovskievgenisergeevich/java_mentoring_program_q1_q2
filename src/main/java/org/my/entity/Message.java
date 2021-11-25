package org.my.entity;

import org.my.utils.Utils;

import java.util.Properties;

public class Message {
    private String from;
    private String to;
    private String subject;
    private String text;

    public Message(String from, String to, String subject, String text) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.text = text;
    }

    public Message() {
        Properties property = Utils.getProperty();
        from = property.getProperty("message.from");
        to = property.getProperty("message.to");
        subject = property.getProperty("message.subject");
        text = property.getProperty("message.text");
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
