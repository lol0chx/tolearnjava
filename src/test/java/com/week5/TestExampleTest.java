package com.week5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExampleTest {

    @Test
    public void multiplyTwoPositiveNumbers_expectPositiveOutcome() {
        // arrange
        TestExample calculator = new TestExample();

        // act
        double result = calculator.multiply(3, 4);

        // assert
        assertEquals(12, result);
    }
}