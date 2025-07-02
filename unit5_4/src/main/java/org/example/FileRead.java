package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead implements IReader {
    private String filePath;
    private BufferedReader reader;

    public FileRead(String filePath)throws IOException {
        this.filePath=filePath;
        this.reader = new BufferedReader(new FileReader(filePath));
    }

    @Override
    public String readNextLine() throws IOException {
            return reader.readLine();
    }
}
