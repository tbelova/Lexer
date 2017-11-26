package ru.spbau;

import java.io.*;
import java.nio.charset.Charset;

import static org.apache.commons.io.FileUtils.readFileToString;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("No file.");
            return;
        }
        String fileName = args[0];

        String result = "";
        try {
            result = new MyParser(readFileToString(new File(fileName), (Charset) null)).printTree();
        } catch (IOException e) {
            System.out.println("failed");
            return;
        }

        String outFileName = fileName.split(".")[0] + ".parsed";
        try {
            PrintWriter writer = new PrintWriter(outFileName, "UTF-8");
            writer.print(result);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

}
