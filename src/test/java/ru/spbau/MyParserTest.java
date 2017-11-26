package ru.spbau;

import org.junit.Test;

import java.io.File;
import java.nio.charset.Charset;

import static org.apache.commons.io.FileUtils.readFileToString;
import static org.junit.Assert.assertEquals;

public class MyParserTest {

    private String path = "./src/test/java/ru/spbau/";

    @Test
    public void test1() throws Exception {
        String s = readFileToString(new File(path + "test1.in"), (Charset) null);
        assertEquals(readFileToString(new File(path + "test1.out"), (Charset) null), new MyParser(s).printTree());
    }

    @Test
    public void test2() throws Exception {
        String s = readFileToString(new File(path + "test2.in"), (Charset) null);
        assertEquals(readFileToString(new File(path + "test2.out"), (Charset) null), new MyParser(s).printTree());
    }

    @Test
    public void test3() throws Exception {
        String s = readFileToString(new File(path + "test3.in"), (Charset) null);
        assertEquals(readFileToString(new File(path + "test3.out"), (Charset) null), new MyParser(s).printTree());
    }

    @Test
    public void test4() throws Exception {
        String s = readFileToString(new File(path + "test4.in"), (Charset) null);
        assertEquals(readFileToString(new File(path + "test4.out"), (Charset) null), new MyParser(s).printTree());
    }

    @Test
    public void test5() throws Exception {
        String s = readFileToString(new File(path + "test5.in"), (Charset) null);
        assertEquals(readFileToString(new File(path + "test5.out"), (Charset) null), new MyParser(s).printTree());
    }

    @Test
    public void test6() throws Exception {
        String s = readFileToString(new File(path + "test6.in"), (Charset) null);
        assertEquals(readFileToString(new File(path + "test6.out"), (Charset) null), new MyParser(s).printTree());
    }

    @Test
    public void test7() throws Exception {
        String s = readFileToString(new File(path + "test7.in"), (Charset) null);
        assertEquals(readFileToString(new File(path + "test7.out"), (Charset) null), new MyParser(s).printTree());
    }

    @Test
    public void test8() throws Exception {
        String s = readFileToString(new File(path + "test8.in"), (Charset) null);
        assertEquals(readFileToString(new File(path + "test8.out"), (Charset) null), new MyParser(s).printTree());
    }

    @Test
    public void test9() throws Exception {
        String s = readFileToString(new File(path + "test9.in"), (Charset) null);
        assertEquals(readFileToString(new File(path + "test9.out"), (Charset) null), new MyParser(s).printTree());
    }

}