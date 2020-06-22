package Demo.FanSheDemo;

import java.lang.reflect.Method;
import java.util.Date;
//import org.junit.Test;

public class DemoPrint {
//        @Test//public void m1()
        public void test1() throws Exception{
            Class clazz = Class.forName("com.cj.test.Person");
            Person p = (Person)clazz.newInstance();
            Method m = clazz.getMethod("m1", null);
            m.invoke(p, null);
        }
//        @Test//public void m2(String name)
        public void test2() throws Exception{
            Class clazz = Person.class;
            Person p = (Person) clazz.newInstance();
            Method m = clazz.getMethod("m2", String.class);
            m.invoke(p, "张三");
        }
//        @Test//public String m3(String name,int age)
        public void test3() throws Exception{
            Class clazz = Person.class;
            Person p = (Person) clazz.newInstance();
            Method m = clazz.getMethod("m3", String.class,int.class);
            String returnValue = (String)m.invoke(p, "张三",23);
            System.out.println(returnValue);
        }
//        @Test//private void m4(Date d)
        public void test4() throws Exception{
            Class clazz = Person.class;
            Person p = (Person) clazz.newInstance();
            Method m = clazz.getDeclaredMethod("m4", Date.class);
            m.setAccessible(true);
            m.invoke(p,new Date());
        }
//        @Test//public static void m5()
        public void test5() throws Exception{
            Class clazz = Person.class;
            Method m = clazz.getMethod("m5", null);
            m.invoke(null,null);
        }
//        @Test//private static void m6(String[] strs)
        public void test6() throws Exception{
            Class clazz = Person.class;
            Method m = clazz.getDeclaredMethod("m6",String[].class);
            m.setAccessible(true);
            m.invoke(null,(Object)new String[]{"a","b"});
        }
//        @Test
        public void test7() throws Exception{
            Class clazz = Person.class;
            Method m = clazz.getMethod("main",String[].class);
            m.invoke(null,new Object[]{new String[]{"a","b"}});
        }
}
