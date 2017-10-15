package ru.spbau;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import static org.apache.commons.io.FileUtils.getUserDirectory;
import static org.apache.commons.io.FileUtils.readFileToString;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("No file.");
            return;
        }

        List<Token> tokens = null;
        try {
            tokens = Tokenizer.getTokens(readFileToString(new File(args[0]), (Charset) null));
        } catch (IOException e) {
            System.out.println("Failed to read this file.");
        }

        for (Token token: tokens) {
            System.out.print(token.toString());
        }

        System.out.println();

    }

}
