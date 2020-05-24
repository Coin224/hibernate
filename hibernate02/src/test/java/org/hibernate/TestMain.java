package org.hibernate;

import org.hibernate.dao.CarDao;
import org.hibernate.domain.Car;
import org.junit.Test;

public class TestMain {

    @Test
    public  void save() {
        CarDao carDao = new CarDao();
        carDao.save(new Car(1,"bmw","pink"));
    }
}
