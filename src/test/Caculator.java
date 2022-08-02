package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Caculator {
    public static int caculate(int a, int b, char o) {
        return 0;
    }

    @Test
    void tesCaculateAdd(){
        int a = 2;
        int b = 1;
        char o = '+';
        int expected = 2;
        int result = Caculator.caculate(a,b,o);
        assertEquals(expected,result);
    }
}
