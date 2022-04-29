package com.topband.springbootdemo4.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainControllerTest {

    private MainController mainControllerUnderTest;

    @BeforeEach
    void setUp() {
        mainControllerUnderTest = new MainController();
    }

    @Test
    void testHello() {
        // Setup
        // Run the test
        final String result = mainControllerUnderTest.hello();

        // Verify the results
        assertThat(result).isEqualTo("result");
    }
}
