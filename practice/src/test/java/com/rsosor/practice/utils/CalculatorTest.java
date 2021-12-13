package com.rsosor.practice.utils;

import com.rsosor.practice.utils.Calculator;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void addAndAssert() {
        // 1. Arrange
        Calculator calculator = new Calculator();
        int number1 = 10;
        int number2 = 100;
        int expected = 110;

        // 2. Act
        int actual = calculator.add(number1, number2);

        // 3 Assert
        assertThat(actual).isEqualTo(expected);
    }
}
