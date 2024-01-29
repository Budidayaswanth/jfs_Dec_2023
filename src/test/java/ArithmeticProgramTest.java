import leo.Java.Jsf.day4.ArithmeticProgram;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ArithmeticProgramTest {
    int a=5;
    int b=4;
    @Test
    @DisplayName("Run the Addition Operation")
    void adding(){
        int actual = ArithmeticProgram.addition(a, b);
        int expected =9;
        assertEquals(expected,actual,"Adding the Two Numbers");
    }
    @Test
    @DisplayName("Run the Subtraction")
    void sub(){
        int expected=1;
        int actual =ArithmeticProgram.Subtraction(a,b);
        assertEquals(expected,actual," subtracting the two Numbers");
    }

    @Test
    @DisplayName("Run the Division")
            void div() {
        int expected = 1;
        int actual = ArithmeticProgram.division(a,b);
        assertEquals(expected,actual,"diving the two Numbers");
    }
    @Test
    @DisplayName("Run the modules Operation")
    void mod(){
       int  actual =ArithmeticProgram.modules(a,b);
        int  expected=1;
        assertEquals(expected,actual,"modules of two Numbers ");
    }
}
