package org.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.domain.Car;

public class CarDao {
    public void save(Car car) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        //开启事务
        session.beginTransaction();
        session.save(car);
        //获取事务 然后提交
        session.getTransaction().commit();
    }
}
