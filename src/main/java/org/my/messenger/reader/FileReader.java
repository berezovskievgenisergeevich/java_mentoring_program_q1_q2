package org.my.messenger.reader;

import org.my.utils.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {

    public String read(String filePath) {

        StringBuffer builder = new StringBuffer();
        try {
            for (Object str : Files.lines(Paths.get(filePath)).toArray()) {
                builder.append(str).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return Utils.deleteLastEmptyString(builder).toString();
    }


}
