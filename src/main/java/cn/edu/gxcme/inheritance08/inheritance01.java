package cn.edu.gxcme.inheritance08;

/**
 * Created by Administrator on 2017/3/7 0007.
 */
public class inheritance01 {                    // 面向对象中的继承（inheritance）  父类
   int ags;
   String name;
}
class students extends inheritance01{       // 一个学生类 注extends inheritance01表示继承上面类的内容   子类
    void xs(){
        System.out.println("年龄"+ags+"------"+"名字"+name);
              }
}
class workers extends inheritance01{        // 一个工人类 注extends inheritance01表示继承上面类的内容   子类
    void gr(){                              // 注一个子类只可以继承一个父类
        System.out.println("年龄"+ags+"------"+"名字"+name);
              }
}
class zhu{

    public static void main(String[] args){
        students p = new students();
        p.ags=19;
        p.name="洋溢";
        p.xs();
        workers p2 = new workers();
        p2.ags=20;
        p2.name="王记";
        p2.gr();
        System.out.println("洋溢"+"和"+"王记"+"幸福久久");
    }
}