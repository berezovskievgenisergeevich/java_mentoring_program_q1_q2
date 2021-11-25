package org.my.exceptions;

public class TemplateException extends Exception {

    public TemplateException(String message) {
        super("The template does not contain the " + message + " tag");
    }


}
