package com.itdr.basic4.demo3;


public class StudentText {
    public static void main(String[] args) throws CloneNotSupportedException{   //4

        //1
        /*Student s1 = new Student();
        System.out.println(s1.hashCode());
        Student s2 = new Student();
        System.out.println(s2.hashCode());
        Student s3 = s1;
        System.out.println(s3.hashCode());
        System.out.println("--------------");

        Student s = new Student();
        Class c = s.getClass();
        String str = c.getName();
        System.out.println(str);

        String str2 = s.getClass().getName();
        System.out.println(str2);*/

        //2
        /*Student s = new Student();
        System.out.println(s.hashCode());
        System.out.println(s.getClass().getName());
        System.out.println("-------------");
        System.out.println(s.toString());
        System.out.println("-------------");

        System.out.println(s.getClass().getName() + '@' +Integer.toHexString(s.hashCode()));
        System.out.println(s.toString());
        System.out.println(s);*/

        //3
        /*Student s1 = new Student("洛璃",27);
        Student s2 = new Student("洛璃",27);
        System.out.println(s1 == s2);
        Student s3 = s1;
        System.out.println(s1 == s3);
        System.out.println("-------------");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s1));
        System.out.println(s1.equals(s3));
        Student s4 = new Student("秋明",30);
        System.out.println(s1.equals(s4));

        Demo d = new Demo();
        System.out.println(s1.equals(d));*/

        //4
        Student s = new Student();
        s.setName("洛璃");
        s.setAge(27);

//        Object obj = s.clone();
//        Student s2 = (Student)obj;
        System.out.println("-------------");

        System.out.println(s.getName()+"---"+s.getAge());
//        System.out.println(s2.getName()+"---"+s2.getAge());

        Student s3 = s;
        System.out.println(s3.getName()+"---"+s3.getAge());
        System.out.println("-------------");

        s3.setName("秋明");
        s3.setAge(30);
        System.out.println(s.getName()+"---"+s.getAge());
//        System.out.println(s2.getName()+"---"+s2.getAge());
        System.out.println(s3.getName()+"---"+s3.getAge());
    }
}
