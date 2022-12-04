package com.skypro.calculator;

import com.skypro.calculator.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class CalculatorParamTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("plusTestSuites")
    public void plusTest(int num1, int num2, int result) {
        Assertions.assertEquals(result, calculatorService.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("minusTestSuites")
    public void minusTest(int num1, int num2, int result) {
        Assertions.assertEquals(result, calculatorService.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("multiplyTestSuites")
    public void multiplyTest(int num1, int num2, int result) {
        Assertions.assertEquals(result, calculatorService.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("divideTestSuites")
    public void divideTest(int num1, int num2, int result) {
        Assertions.assertEquals(result, calculatorService.divide(num1, num2));
    }

    public static List<Arguments> plusTestSuites() {
        return List.of(
                Arguments.of(5, 3, 8),
                Arguments.of(-5, 3, -2),
                Arguments.of(0, 0, 0));
    }

    public static List<Arguments> minusTestSuites() {
        return List.of(
                Arguments.of(5, 3, 2),
                Arguments.of(-5, 3, -8),
                Arguments.of(0, 0, 0));
    }

    public static List<Arguments> multiplyTestSuites() {
        return List.of(
                Arguments.of(5, 3, 15),
                Arguments.of(-5, 3, -15),
                Arguments.of(0, 0, 0));
    }

    public static List<Arguments> divideTestSuites() {
        return List.of(
                Arguments.of(15, 3, 5),
                Arguments.of(-6, -3, 2),
                Arguments.of(0, 1, 0));
    }
}
