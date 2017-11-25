package ru.spbau;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import static org.apache.commons.io.FileUtils.readFileToString;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("No file.");
            return;
        }

        String result = "";
        try {
            result = new MyParser(readFileToString(new File(args[0]), (Charset) null)).printTree();
        } catch (IOException e) {
            System.out.println("failed");
            return;
        }

        System.out.println(result);

    }

}
