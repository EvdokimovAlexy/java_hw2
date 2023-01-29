package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class hw2_ex_002 {
    public static StringBuilder getSB(String word) {
        StringBuilder sbRepeat = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sbRepeat.append(word);
        }
        return sbRepeat;
    }

    public static void saveFile(StringBuilder content, String fileName, boolean addRec) {
        try (FileWriter fw = new FileWriter(fileName, addRec)) {
            fw.write(content.toString());
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {

        String word = "TEST";
        StringBuilder sbRepeat = getSB(word);
        System.out.println(sbRepeat);
        saveFile(sbRepeat, "test_repeat.txt", false);


    }
}