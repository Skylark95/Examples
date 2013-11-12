package com.skylark95.examples.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.skylark95.examples.junit.exceptions.MyException;

public class ExceptionsTest {
    
    private Exceptions exceptions;
    
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        exceptions = new Exceptions();
    }
    
    @Test(expected = MyException.class)
    public void doesThrowMyException() throws MyException {
        exceptions.throwMyException();
    }
    
    @Test
    public void doesThrowMyExceptionWithMessageTryCatchTest() throws MyException {
        try {
            exceptions.throwMyExceptionWithAMessage();
        } catch (MyException e) {
            assertEquals("With a message", e.getMessage());
        }
    }
    
    @Test
    public void doesThrowMyExceptionWithMessageRuleTest() throws MyException {
        expectedException.expect(MyException.class);
        expectedException.expectMessage("With a message");
        exceptions.throwMyExceptionWithAMessage();
    }


}
