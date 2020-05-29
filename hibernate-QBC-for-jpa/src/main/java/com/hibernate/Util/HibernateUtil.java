package com.hibernate.Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

    //  1.创建一个静态属性工厂
    private static SessionFactory factory;

    //给静态属性工厂赋值
    static {

        //通过标准服务注册机注册效率更高
        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
        Configuration configuration = new Configuration();
        //configuration.configure();//就不用configuration读取配置文件了
        factory = configuration.buildSessionFactory(standardServiceRegistry);
    }

    //通过静态属性工厂打开session会话
    public static Session getSession() {

        return factory.openSession();
    }
}
