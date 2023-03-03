package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.awt.SystemColor.info;

public class fileManageA implements FileManagement {
public void writeFile(String path, Object info){
    File file = new File(path) ;
    try {
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(info.toString());
        printWriter.close();
    }catch (IOException e){
        e.printStackTrace();

    }
}

    @Override
    public String readFile(String path) {
        File file = new File(path);
        StringBuilder builder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                builder.append(scanner.next()).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
}
