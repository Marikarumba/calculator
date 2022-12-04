package com.skypro.calculator;

import com.skypro.calculator.service.CalculatorService;
import com.skypro.calculator.service.IllegalNumberException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorServiceTests {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plusTest(){
        int num1 = 5;
        int num2 = 3;
        int result = 8;
        Assertions.assertEquals(result, calculatorService.plus(num1,num2));
    }

    @Test
    public void minusTest(){
        int num1 = 5;
        int num2 = 3;
        int result = 2;
        Assertions.assertEquals(result, calculatorService.minus(num1,num2));
    }
    @Test
    public void multiplyTest(){
        int num1 = 5;
        int num2 = 3;
        int result =15;
        Assertions.assertEquals(result, calculatorService.multiply(num1,num2));
    }
    @Test
    public void divideTest(){
        int num1 = 6;
        int num2 = 3;
        int result = 2;
        Assertions.assertEquals(result, calculatorService.divide(num1,num2));
    }

    @Test
    public void divideTestNull(){
        Assertions.assertThrows(IllegalNumberException.class,() ->{
            calculatorService.divide(1,0);
        });
    }



}
