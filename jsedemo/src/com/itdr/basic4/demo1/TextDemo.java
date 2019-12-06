package com.itdr.basic4.demo1;

public class TextDemo {
    public static void main(String[] args) {
        //1
        /*Fu a = new Zi1();
        a.eat();
        System.out.println("-------------");
        Zi1 d = (Zi1)a;
        d.eat();
        d.lookDoor();
        System.out.println("--------------");
        a = new Zi2();
        a.eat();
        System.out.println("---------------");
        Zi2 c = (Zi2)a;
        c.eat();
        c.playGame();
        System.out.println("----------------");
//        Zi1 dd = new Fu(); //大转小，要强转
//        Zi1 ddd = new Zi2();//平级之间不能相互赋值
//        Zi1 dd = (Zi1)a;*/

        //2
        /*Fu f = new Zi1();
        f.show();

        Zi1 z = new Zi2();
        z.show();*/

        //3
        /*Zi1 d = new Zi1();
        d.setName("旺财");
        d.setAge(3);
        System.out.println(d.getName()+"---"+d.getAge());
        d.eat();
        Zi1 d2 = new Zi1("旺财",3);
        System.out.println(d2.getName()+"---"+d2.getAge());
        d2.eat();
        System.out.println("----------------");
        Fu a = new Zi1();
        a.setName("旺财");
        a.setAge(3);
        System.out.println(a.getName()+"---"+a.getAge());
        a.eat();
        Fu a2 = new Zi1("旺财",3);
        System.out.println(a2.getName()+"---"+a2.getAge());
        a2.eat();*/

        //4
        /*Fu emp = new Zi1();
        emp.setName("小白");
        emp.setId("czbk001");
        emp.setSalary(18000);
        System.out.println(emp.getName()+"---"+emp.getId()+"---"+emp.getSalary());
        emp.work();
        System.out.println("---------------------");
        emp = new Zi1("小红","czbk001",18000);
        System.out.println(emp.getName()+"---"+emp.getId()+"---"+emp.getSalary());
        emp.work();
        System.out.println("---------------------");

        Zi2 m = new Zi2();
        m.setName("小蓝");
        m.setId("czbk002");
        m.setSalary(8000);
        m.setMoney(2000);
        System.out.println(m.getName()+"---"+m.getId()+"---"+m.getSalary()+"---"+m.getMoney());
        m.work();
        System.out.println("---------------------");

        m = new Zi2("小紫","czbk002",8000,2000);
        System.out.println(m.getName()+"---"+m.getId()+"---"+m.getSalary()+"---"+m.getMoney());
        m.work();*/

        //5
        /*Fu p = new Zi1();
        p.eat();
        System.out.println("-----------------");
        Zi1 sp = (Zi1)p;
        sp.eat();
        sp.jingshang();
        System.out.println("-----------------");

        p = new Zi2();
        p.eat();
        System.out.println("-----------------");
        Zi2 np = (Zi2)p;
        np.eat();
        np.yanjiu();*/

        //6
    }
}
