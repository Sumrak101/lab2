package org.example;

import org.junit.After;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class MainTest {

    @Test(timeout = 120)
    @After
    public void zadachatest1() {
        String input = "2008";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals( "Кол-во дней 366", Main.zadacha1());
    }


    @Test
    public void zadachatest2() {
        String input = "2096";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals( "Кол-во дней 366", Main.zadacha1());
    }


    @Test(timeout = 10)
    public void zadachatest3() {
        String input = "2007";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals( "Кол-во дней 366", Main.zadacha1());
    }

    @Test
    public void zadachatest4() {
        String input = "2100";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals( "Кол-во дней 365", Main.zadacha1());
    }
}