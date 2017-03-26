package cn.edu.gxcme.multithreading12;

/**
 * Created by Administrator on 2017/3/20 0020.
 */
/*
进程：正在执行的程序（自译）
线程：就是进程中一个负责执行的控制单元（执行路径）
一个进程中可以有多个执行路径，称之为多线程

一个进程中最少要有一个线程
开启多个线程就是为了同时执行多部分代码
每个线程都有自己的运行内容，这个内容叫线程要执行的任务

*/
public class multithreading01 extends Thread{   // 注Thread为被继承的固定代码 目的就是让指定代码跟其它代码同时运行
        String name;
        multithreading01(String name)
        {
            this.name = name;               // 方法一
        }
        public void run()       // 注固定run方法
        {
            lei();          // 调用下面的lei方法 也可以直接复制下面代码上来
        }
        public void lei()
        {
            for (int x=0;x<10;x++)
            {
                System.out.println(name+"x="+x+"---name"+getName());  // 如要加编号（0,1，。。）加getName()固定代码
            }
        }
}
class zhu
    {
        public static void main(String[] args)
        {
            multithreading01 q1 = new multithreading01("旺财");
            multithreading01 q2 = new multithreading01("小黄");
            q1.start();         // 注start为固定代码目的就是让代码同时运行  38到41行为主线程
            q2.start();
        }
    }