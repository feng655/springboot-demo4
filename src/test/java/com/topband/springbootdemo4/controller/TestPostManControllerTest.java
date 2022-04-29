package com.topband.springbootdemo4.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TestPostManControllerTest {

    private TestPostManController testPostManControllerUnderTest;//引入controller对象

    @BeforeEach
    void setUp() {
        testPostManControllerUnderTest = new TestPostManController();//实例化测试的对象
    }

    @Test
    void testTestAll() {
        // Setup
        // Run the test
        final String result = testPostManControllerUnderTest.testAll("text");//向对象中传入测试的参数

        // Verify the results
        assertThat(result).isEqualTo("result");
    }

    @Test
    void testTestGet() {
        // Setup
        // Run the test
        final String result = testPostManControllerUnderTest.testGet("text");

        // Verify the results  验证result
        assertThat(result).isEqualTo("result");
    }

    @Test
    void testTestPost() {
        // Setup
        // Run the test 启动测试
        final String result = testPostManControllerUnderTest.testPost("result");

        // Verify the results
        assertThat(result).isEqualTo("result");
    }
}
