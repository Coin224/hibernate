package org.hibernate;

import org.hibernate.dao.CarDao;
import org.hibernate.domain.Car;
import org.junit.Test;

public class TestMain {

    @Test
    public  void save() {
        //通过new关键字创建对象
        CarDao carDao = new CarDao();
    }
}
