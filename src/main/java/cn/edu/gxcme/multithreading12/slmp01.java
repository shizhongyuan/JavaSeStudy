package cn.edu.gxcme.multithreading12;

import cn.edu.gxcme.study06.Teacher;
import sun.security.krb5.internal.Ticket;

/**
 * Created by Administrator on 2017/3/22 0022.
 */
//   需求：同时卖出火车票
public class slmp01 implements Runnable            //extends Thread
{
        private int piao = 20;
        Object obj = new Object();   // 注固定
        public void run()
        {
            while (true){
                synchronized (obj)           // 同步代码块 解决多线程的安全问题
            { if (piao>0)
                {
    System.out.println(Thread.currentThread().getName()+"---------"+piao--);
                }
            }
        }
    }
}
class han
{
    public static void main(String[] args)
    {
       /*slmp01 p1 = new slmp01();
        slmp01 p2 = new slmp01();
        slmp01 p3 = new slmp01();
        p1.start();
        p1.start();
        p1.start();*/
    slmp01 m = new slmp01();        // 火车票
    slmp01 mm = new slmp01();       //动车票
    Thread m1 = new Thread(m);
    Thread m2 = new Thread(mm);
    Thread m3 = new Thread(mm);
    m1.start();     // 注start为固定代码目的就是让代码同时运行
    m2.start();
    m3.start();
    }
}
