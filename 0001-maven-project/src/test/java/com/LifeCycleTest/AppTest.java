package com.LifeCycleTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


import com.LifeCycle.Calculator;



@Disabled("All the test cases Disabled")
public class AppTest {

   @BeforeAll
    static void beforeAll() {
        System.out.println("Before all method is executed");
    }
    
    @BeforeEach
    void beforeEach() {
        System.out.println("Before each method is executed");
    }
    
    @Test
    void testOne() {
        System.out.println("Addition testOne is executed");
        Assertions.assertEquals(12,  Calculator.add(6, 6));
    }
    
    @Test
    void testTwo() {
        System.out.println("Addition testTwo is executed");
        Assertions.assertEquals(20, Calculator.add(10, 10));
    }
    
    @AfterEach
    void afterEach() {
        System.out.println("@After each method is executed");
    }
    
    @AfterAll
    static void afterAll() {
        System.out.println("Cleanup process is done");
    }
}