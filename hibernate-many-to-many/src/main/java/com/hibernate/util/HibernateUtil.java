package com.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {


    private static SessionFactory sessionFactory;
    static {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        Configuration configuration = new Configuration();
        sessionFactory = configuration.buildSessionFactory(registry);
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }
}
