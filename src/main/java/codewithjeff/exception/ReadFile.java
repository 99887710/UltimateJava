package codewithjeff.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ReadFile {

    public void read(String path) throws IOException, ParseException {
        try (FileReader fileReader = new FileReader(path)){
            fileReader.read();
            new SimpleDateFormat().parse("");
        } catch (IOException | ParseException e) {
            System.out.println("Logging");
            throw e;
        }    }
}
