package com.itdr.basic3;

public class Student extends Demo {   //9   //10   //11   //12...//15

    //0
    /*Demo d = new Demo();
    Student(){
        System.out.println("X");
    }*/
    //1
    /*static{
        System.out.println("Student 静态代码块");
    }
    {
        System.out.println("Student 构造代码块");
    }
    public Student(){
        System.out.println("Student 构造方法");
    }*/

    //2
    /*int nus = 10;
    int num;

    public void show(){
        int num2 = 20;
        int num3 = 30;
        System.out.println(num2);
        System.out.println(num3);

        int num = 100;
        System.out.println(num);
    }*/

    //3
    /*public void show(){
        System.out.println("我爱学习");
    }*/

    //4
    /*public void show(){
        System.out.println("我爱学习");
    }*/

    //6
    /*String name;
    int age;
    public void setAge(int a){
        if(a <0 || age>120){
            System.out.println("你给的年龄有问题");
        }else{
            age = a;
        }
    }

    public void show(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
    }*/

    //7
    /*private String name;
    private int age;

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }*/

    //8
    /*public static int num = 10;
    public static int num2 = 20;

    public void show(){
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(num2);
    }

    public static void method(){
        System.out.println(num);
        System.out.println(num2);

        function();
        function2();
    }

    public static void function(){}
    public static void function2(){}*/

    //10
    /*public void function(){
        System.out.println(num);
        System.out.println(num2);
    }*/

    //11
    /*public int num = 20;

    public void show(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }*/

    //12
    /*public Student(){
        super("随便给");
        System.out.println("Student的无参构造方法");
    }
    public Student(String name){
        this();
        System.out.println("Student的有参构造方法");
    }*/

    //13
    /*public void call(String name){
        super.call(name);
        System.out.println("可以听天气预报了");
    }*/

    //14
    /*public int num = 20;
    public Student(){
        System.out.println("zi");
    }
    public void show(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }*/

    //15
    /*static {
        System.out.println("静态代码块zi");
    }
    {
        System.out.println("构造代码块zi");
    }
    public Student(){
        System.out.println("构造方法zi");
    }*/

    //16
    /*int age = 10;*/

    //17
    /*public int num = 1000;
    public int num2 = 200;
    public void show(){
        System.out.println("show Zi");
    }
    public void method(){
        System.out.println("method Zi");
    }
    public static void function(){
        System.out.println("function Zi");
    }*/

    //18
    /*public void show(){
        System.out.println("show Zi");
    }
    public void method(){
        System.out.println("method Zi");
    }*/
}
