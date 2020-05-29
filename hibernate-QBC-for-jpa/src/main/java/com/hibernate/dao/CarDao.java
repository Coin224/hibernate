package com.hibernate.dao;

import com.hibernate.Util.HibernateUtil;
import com.hibernate.domain.Car;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CarDao {

    private Session session = HibernateUtil.getSession();




    public void save() {
        session.beginTransaction();
        session.save(new Car(4,"biyadi","蓝色"));
        session.getTransaction().commit();
    }


    //QBC for JPA
    public void getCarList() {
        //1.获取标准建造者CriteriaBuilder对象，来构建查询模式
        CriteriaBuilder builder = session.getCriteriaBuilder();

        //2.获得查询对象CriteriaQuery
        CriteriaQuery<Car> query = builder.createQuery(Car.class);

        //3.获得目标对象root
        Root<Car> table = query.from(Car.class);

        //4.构建查询
        //select * from t_car;
        query.select(table);

        //5.执行查询
        List<Car> cars = session.createQuery(query).list();//获取所有
        //Car car = session.createQuery(query).getSingleResult();
        System.out.println(cars);
    }


    //QBC for JPA
    public void getCar() {
        //1.获取标准建造者CriteriaBuilder对象，来构建查询模式
        CriteriaBuilder builder = session.getCriteriaBuilder();

        //2.获得查询对象CriteriaQuery
        CriteriaQuery<Car> query = builder.createQuery(Car.class);

        //3.获得目标对象root
        Root<Car> table = query.from(Car.class);

        //4.构建查询
        //select * from t_car;
        query.select(table).where(builder.equal(table.get("cno"),1));//过滤查询

        //5.执行查询
        //List<Car> cars = session.createQuery(query).list();//获取所有
        Car car = session.createQuery(query).getSingleResult();
        System.out.println(car);
    }


    //QBC for JPA
    public void getOrderBy() {
        //1.获取标准建造者CriteriaBuilder对象，来构建查询模式
        CriteriaBuilder builder = session.getCriteriaBuilder();

        //2.获得查询对象CriteriaQuery
        CriteriaQuery<Car> query = builder.createQuery(Car.class);

        //3.获得目标对象root
        Root<Car> table = query.from(Car.class);

        //4.构建查询
        //select * from t_car;
        query.select(table);//过滤查询
        query.orderBy(builder.desc(table.get("cno")));//order by cno desc;

        //5.执行查询
        //List<Car> cars = session.createQuery(query).list();//获取所有
        List<Car> cars = session.createQuery(query).list();
        System.out.println(cars);
    }


    //QBC for JPA    分页用session
    public void find5() {
        //1.获取标准建造者CriteriaBuilder对象，来构建查询模式
        CriteriaBuilder builder = session.getCriteriaBuilder();

        //2.获得查询对象CriteriaQuery
        CriteriaQuery<Car> query = builder.createQuery(Car.class);

        //3.获得目标对象root
        Root<Car> table = query.from(Car.class);

        //4.构建查询
        //select * from t_car;
        query.select(table);//过滤查询

        //5.执行查询
        //List<Car> cars = session.createQuery(query).list();//获取所有
        List<Car> cars = session.createQuery(query).setFirstResult(1).setMaxResults(2).list();//分页
        System.out.println(cars);
    }


    public void find1() {
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Car> query = builder.createQuery(Car.class);//查询的要组装成的对象
        Root<Car> table1 = query.from(Car.class);//查询的表


        query.select(table1);//构建查询
        List<Car> cars = session.createQuery(query).list();
        System.out.println(cars);
    }
}
