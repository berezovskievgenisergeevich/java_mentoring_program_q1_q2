package org.my.utils.console;

import org.my.messenger.reader.ConsoleReader;
import org.my.utils.Utils;


public class ConsoleMessageReader {

    /**
     * Reads a message from the console, used for manual startup
     *
     * @return console input
     */
    public static String readMessage() {
        ConsoleReader stdin = new ConsoleReader();
        String line;

        StringBuffer stringBuffer = new StringBuffer();
        while ((line = stdin.read()) != null && line.length() != 0) {
            stringBuffer.append(line).append("\n");
        }

        return Utils.deleteLastEmptyString(stringBuffer).toString();

    }

    /**
     * Reads a message from the console, used for testing
     *
     * @return console input
     */
    public static String readMessageT() {
        ConsoleReader stdin = new ConsoleReader();
        StringBuffer stringBuffer = new StringBuffer();

        stdin.readAll().stream().forEach(it -> {
            stringBuffer.append(it).append("\n");

        });

        return Utils.deleteLastEmptyString(stringBuffer).toString();
    }
}
