package net.albertogarrido.resume.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void textShouldBeContactToArgument() {
        MyClass myClass = new MyClass();
        assertEquals(myClass.greetingWith("Alberto"), "Hello, Alberto");
    }



}
