package com.hibernate.dao;

import com.hibernate.domain.Student;
import com.hibernate.domain.Teacher;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TeacherDao {


    private Session session = HibernateUtil.getSession();

    /*级联保存*/
    public void save() {

        /*创建老师对象*/
        Teacher t1 = new Teacher("兰姐1",5000);
        Teacher t2 = new Teacher("兰姐2",7000);

        /*创建学生对象*/
        Student s1 = new Student("李春宏1",24);
        Student s2 = new Student("李春宏2",17);
        Student s3 = new Student("李春宏3",21);
        Student s4 = new Student("李春宏4",18);

        /*把学生赋值给老师1、级联保存*/
        Set<Student> students1 = new HashSet<>();
        students1.add(s1);
        students1.add(s2);
        t1.setStudents(students1);

        /*把学生赋值给老师1、级联保存*/
        /*数据库已经存在s3,s4、那就只保存关系*/
        Set<Student> students2 = new HashSet<>();
        students2.add(s1);
        students2.add(s3);
        students2.add(s4);
        students2.add(s2);
        t2.setStudents(students2);

        /*级联保存要在orm文件中的set属性中的cascade="all"*/

        Transaction ts = session.beginTransaction();
        session.save(t1);
        session.save(t2);
        ts.commit();
    }


    /*QBC for JPA*/
    public void find(){
        CriteriaBuilder builder = session.getCriteriaBuilder();
        /*告诉hibernate组成什么对象*/
        CriteriaQuery<Teacher> query = builder.createQuery(Teacher.class);
        /*告诉hibernate查哪张表*/
        Root<Teacher> table = query.from(Teacher.class);

        query.select(table);

        List<Teacher> ts = session.createQuery(query).list();
        for (Teacher t:ts) {
            System.out.println(t.getTname()+","+t.getSal());
            for (Student s:t.getStudents()) {
                System.out.println("\t"+s.getSname()+","+s.getAge());
            }
        }
    }
}
