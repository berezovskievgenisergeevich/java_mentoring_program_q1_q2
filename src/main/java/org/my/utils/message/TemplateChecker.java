package org.my.utils.message;

import org.my.exceptions.TemplateException;

public class TemplateChecker {
    private static String from = "#{from}";
    private static String to = "#{to}";
    private static String subject = "#{subject}";
    private static String text = "#{text}";

    public static boolean isMessageCorrect(String template) throws TemplateException {
        if (isTempContainFrom(template) && isTempContainTo(template)
                && isTempContainSubject(template) &&
                isTempContainText(template))
            return true;

        return false;
    }

    private static boolean isTempContainFrom(String template) throws TemplateException {
        if (template.contains(from))
            return true;
        throw new TemplateException(from);
    }

    private static boolean isTempContainTo(String template) throws TemplateException {
        if (template.contains(to))
            return true;
        throw new TemplateException(to);

    }

    private static boolean isTempContainSubject(String template) throws TemplateException {
        if (template.contains(subject))
            return true;
        throw new TemplateException(subject);
    }

    private static boolean isTempContainText(String template) throws TemplateException {
        if (template.contains(text))
            return true;
        throw new TemplateException(text);
    }
}
