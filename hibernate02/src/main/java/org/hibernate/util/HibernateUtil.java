package org.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

    private static SessionFactory factory;

    static {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        Configuration configuration = new Configuration();
        factory = configuration.buildSessionFactory(registry);
    }

    //hibernate5以后可以用注册机读配置文件 性能更好
    public static Session getSession() {
        return factory.openSession();
    }
}
