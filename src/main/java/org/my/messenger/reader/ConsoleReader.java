package org.my.messenger.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class ConsoleReader {


    /**
     * Reading a line from the console, used to start manually
     *
     * @return string from console
     */
    public String read() {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        try {
            return stdin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * Reading all lines from the console, used to run the test
     *
     * @return console inputs
     */
    public List<String> readAll() {
        return new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.toList());
    }

}
