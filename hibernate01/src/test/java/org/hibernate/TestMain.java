package org.hibernate;

import org.junit.Test;

public class TestMain {

    @Test
    public void save() {
        Orm orm = new Orm();
        orm.save(new Car(1,"bmw","black"));
    }
}
