package org.hibernate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Orm {



    //封装一个新增的自动生成sql的方法
    public static void save(Object obj) {
        StringBuilder sql = new StringBuilder();
        sql.append("insert into ");//insert into

        // 1 获取表名字 人为规定表名为t_前缀 加上首字母小写的类名字
        Class clazz = obj.getClass();
        String clazzName = clazz.getSimpleName();//Car
        clazzName = clazzName.toLowerCase();//car
        String tableName = "t_" + clazzName;
        sql.append(tableName);//insert into t_car
        sql.append("(");//insert into t_car(
        // 2 添加字段名字 先获取所有的以get开头的方法
        Method[] methods = clazz.getDeclaredMethods();
        List<Object> values = new ArrayList<>();
        for (Method method : methods) {
            if (method.getName().startsWith("get")) {
                // 3 根据get开头的方法名字获取到私有属性的名字 做字段名
                //  从第3位开始截取 并变成小写
                String methodName = method.getName().substring(3).toLowerCase();
                //拼接到sql后面
                sql.append(methodName);
                //并在后面拼上逗号
                sql.append(",");
                // 执行这个方法 得到值
                try {
                    values.add(method.invoke(obj));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        // insert into t_car(cno,brand,color,
        // 3 去掉尾巴上的逗号
        sql.deleteCharAt(sql.lastIndexOf(","));// insert into t_car(cno,brand,color
        sql.append(") values(");// insert into t_car(cno,brand,color) values(
        for (int i = 0 ; i < values.size() ; i ++) {
            sql.append("?,");
        }
        // insert into t_car(cno,brand,color) values(?,?,?,
        // 4 去掉尾巴上的逗号
        sql.deleteCharAt(sql.lastIndexOf(","));
        sql.append(")");
        System.out.println(sql.toString());
        System.out.println(values);
    }
}
