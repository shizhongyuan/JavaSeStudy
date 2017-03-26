package cn.edu.gxcme.multithreading12;

/**
 * Created by Administrator on 2017/3/21 0021.
 */
public class multithreading02 implements Runnable{       // Runnable为固定代码
    public void run()       // 注固定run方法
    {
        lei();          // 调用下面的lei方法 也可以直接复制下面代码上来
    }
    public void lei()               // 方法二
    {
        for (int x=0;x<10;x++)
        {
            System.out.println("x="+x+"---name"+getClass());  // 如要加编号（0,1，。。）加getName()固定代码
        }
    }
}
class zu
{
    public static void main(String[] args)
    {
       multithreading02 q = new multithreading02();
       Thread t1 = new Thread(q);           // 注Thread为固定代码
       Thread t2 = new Thread(q);
        t1.start();         // 注start为固定代码目的就是让代码同时运行  38到41行为主线程
        t2.start();
    }}
