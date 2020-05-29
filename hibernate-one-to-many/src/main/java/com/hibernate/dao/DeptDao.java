package com.hibernate.dao;

import com.hibernate.domain.Dept;
import com.hibernate.domain.Emp;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import java.util.HashSet;
import java.util.Set;

public class DeptDao {


    public void save() {
        Dept dept = new Dept(3,"财务部");
        Emp emp1 = new Emp(301,"李春宏",10000,3);
        Emp emp2 = new Emp(302,"张向新",12000,3);
        Emp emp3 = new Emp(303,"张李凤",13000,3);

        Set<Emp> emps = new HashSet<>();
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);


        //将dept赋值给emp，是保存emp时，emp的dno由dept提供
        dept.setEmps(emps);
        emp1.setDept(dept);
        emp2.setDept(dept);
        emp3.setDept(dept);


        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(dept);
        session.getTransaction().commit();

    }


    public void find1() {
        Session session = HibernateUtil.getSession();
        Dept dept = session.get(Dept.class,1);
        for (Emp emp :dept.getEmps()) {
            System.out.println(emp.getEname()+"==="+emp.getSal());
        }
    }
}
