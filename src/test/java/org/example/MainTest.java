package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void methode1() {
        int zahl1 = 2;

        String actual = Main.methode1(zahl1);

        assertEquals("Die Zahl ist größer als null",actual);
    }

    @org.junit.jupiter.api.Test
    void methode2() {

        int zahl1 = 5;

        int  actual = Main.methode2(zahl1);

        assertEquals(25,actual);
    }
}