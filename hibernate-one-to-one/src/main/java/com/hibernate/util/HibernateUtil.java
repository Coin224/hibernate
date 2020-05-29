package com.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {


    private static SessionFactory factory;

    static {
        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
        Configuration configuration = new Configuration();
        factory = configuration.buildSessionFactory(standardServiceRegistry);
    }

    public static Session getSession() {
        return factory.openSession();
    }
}
