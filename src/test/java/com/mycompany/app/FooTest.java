package com.mycompany.app;

import org.junit.Test;

public class FooTest {

    @Test
    public void testFoo() {
        System.out.println("Testing Foo...");
    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testFooConstructor() {
        Foo f = new Foo();
    }

    @Test
    public void testFooFunc() {
        Foo f = new Foo();
        f.sayHello();
    }
}