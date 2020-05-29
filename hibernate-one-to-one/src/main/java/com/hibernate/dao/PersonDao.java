package com.hibernate.dao;

import com.hibernate.domain.Card;
import com.hibernate.domain.Person;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;

public class PersonDao {



    public void save1() {
        //无论是不是级联属性  最终在数据库中要存储两个对象数据
        //根据orm的特点，每一个表数据都有对应的对象

        Person person = new Person(3,"张想屁",3);
        Card card = new Card(null,5201314,"四川雷江");

        //把card属性赋值给person对象
        person.setCard(card);
        //card的主键值由person提供
        card.setPerson(person);
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();

    }


    public void delete1() {
        Session session = HibernateUtil.getSession();
        Person person = session.get(Person.class,2);
        Card card = session.get(Card.class,2);
        person.setCard(card);
        session.beginTransaction();
        session.delete(person);
        session.getTransaction().commit();
        session.close();
    }


    public void find1() {}
}
