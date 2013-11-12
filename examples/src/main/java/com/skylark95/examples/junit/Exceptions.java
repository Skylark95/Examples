package com.skylark95.examples.junit;

import com.skylark95.examples.junit.exceptions.MyException;

public class Exceptions {
    
    public void throwMyException() throws MyException {
        throw new MyException();
    }

    public void throwMyExceptionWithAMessage() throws MyException {
        throw new MyException("With a message");
    }

}
