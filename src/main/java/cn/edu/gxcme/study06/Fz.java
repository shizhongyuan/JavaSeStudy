package cn.edu.gxcme.study06;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Administrator on 2017/3/3 0003.
 */
 public class Fz {
   int age;
   String name;
   void zj(int sj,String sd)        //小括号里面定义就是函数参数
   {
     age=sj;
     name=sd;
   }
    public void say()           // 普通函数
    {
        System.out.println("年龄="+age+"名字="+name);
    }
    public Fz(int q,String w)         // 有参构造函数
    {
        System.out.println("----");
    }
    public Fz()                 // 无参数构造函数
    {
        System.out.println("======");
    }
    public static void main(String [] argi)
    {
        Fz a = new Fz(12,"小");
        a.zj(20,"小");
        a.say();
        Fz b = new Fz();

    }

}