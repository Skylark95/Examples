package com.skylark95.examples.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HelloTest {
    
    private Hello hello;
    

    @Before
    public void setUp() {
        hello = new Hello();
    }

    @Test
    public void canSayHello() {
        assertEquals("Hello World!", hello.sayHello());
    }

}
