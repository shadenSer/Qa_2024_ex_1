package Qa_2024_ex_1.Qa_2024_ex_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	Question4 tester= new Question4();
    /**
     * Rigorous Test :-)
     */
//    @Test
//    public void shouldAnswerWithTrue() {
//        assertTrue(true);
//    }
    @Test
    public void Test_1() {
    	String Expected_result="A";
    	int a= 18,b=14;
    	String mod="regular";
    	String actual_result=Question4.calculate(a,b,mod);
    	assertEquals(Expected_result,actual_result);
    }
    @Test
    public void Test_2() {
    	String Expected_result="B";
    	int a= -28,b=-24;
    	String mod="regular";
    	String actual_result=Question4.calculate(a,b,mod);
    	assertEquals(Expected_result,actual_result);
    }
    @Test
    public void Test_3() {
    	String Expected_result="A";
    	int a= 28,b=12;
    	String mod="regular";
    	String actual_result=Question4.calculate(a,b,mod);
    	assertEquals(Expected_result,actual_result);
    }
    
    @Test
    public void Test_4() {
    	String Expected_result="A";
    	int a= -28,b=-22;
    	String mod="negative";
    	String actual_result=Question4.calculate(a,b,mod);
    	assertEquals(Expected_result,actual_result);
    }
    @Test
    public void Test_5() {
    	String Expected_result="B";
    	int a= -12,b=-22;
    	String mod="negative";
    	String actual_result=Question4.calculate(a,b,mod);
    	assertEquals(Expected_result,actual_result);
    }
    @Test
    public void Test_6() {
    	String Expected_result="error";
    	int a= -12,b='h';
    	String mod="negative";
    	String actual_result=Question4.calculate(a,b,mod);
    	assertEquals(Expected_result,actual_result);
    }
    @Test
    public void Test_7() {
    	String Expected_result="A";
    	int a= 2,b=5;
    	String mod="reciprocals";
    	String actual_result=Question4.calculate(a,b,mod);
    	assertEquals(Expected_result,actual_result);
    }
    @Test
    public void Test_8() {
    	String Expected_result="B";
    	int a= 4,b=1;
    	String mod="reciprocals";
    	String actual_result=Question4.calculate(a,b,mod);
    	assertEquals(Expected_result,actual_result);
    }
    @Test
    public void Test_9() {
    	String Expected_result="A";
    	int a= 5,b=0;
    	String mod="reciprocals";
    	String actual_result=Question4.calculate(a,b,mod);
    	assertEquals(Expected_result,actual_result);
    }
    
    
    
}
