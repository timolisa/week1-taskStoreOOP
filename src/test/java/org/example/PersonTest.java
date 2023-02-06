package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    @org.junit.jupiter.api.Test
    void getName() {
        Person person = new Person("Timothy Olisaeloka");
        Assert.assertEquals("Timothy Olisaeloka", person.getName());
    }
}