package ru.spbau;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyParserTest {
    @Test
    public void test1() throws Exception {
        String s = "x + 1;";
        System.out.println(new MyParser(s).printTree());
    }

    @Test
    public void test2() throws Exception {
        String s = "y := x + 1;";
        System.out.println(new MyParser(s).printTree());
    }

    @Test
    public void test3() throws Exception {
        String s = "{ y := x + 1;}";
        System.out.println(new MyParser(s).printTree());
    }

    @Test
    public void test4() throws Exception {
        String s = "f(x) { y := x + 1; return y;}";
        System.out.println(new MyParser(s).printTree());
    }

    @Test
    public void test5() throws Exception {
        String s = "read(a); x := 0; y := 1; while (a >= 1) { x := x + 1; y := x * x + 10 - 7 * (y + 1); a := a - 1; } write(x, y);";
        System.out.println(new MyParser(s).printTree());
    }

    @Test
    public void test6() throws Exception {
        String s = "if (a >= 5) then { return 0; }";
        System.out.println(new MyParser(s).printTree());
    }

    @Test
    public void test7() throws Exception {
        String s = "if (a >= 5 * 185 && x > 10 - 7 || b == 9 * 14 + 13 - 5 * 10 && c <= -1) then { return 0; }";
        System.out.println(new MyParser(s).printTree());
    }

}