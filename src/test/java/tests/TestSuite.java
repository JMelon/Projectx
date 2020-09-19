package tests;

import org.junit.jupiter.api.*;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestSuite {

    @Test
    public void TestCase() {
        LocalTime time = LocalTime.now();
        System.out.println("Hello world, it's " + time.format(DateTimeFormatter.ofPattern("HH:mm:ss")) + " o'clock");
    }
}