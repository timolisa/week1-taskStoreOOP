package org.retailstore;

import org.junit.Assert;
import org.junit.Test;

class PersonTest {

    @Test
    @org.junit.jupiter.api.Test
    void shouldGetPersonName() {
        Person person = new Person("Timothy Olisaeloka");
        Assert.assertEquals("Timothy Olisaeloka", person.getName());
    }
}