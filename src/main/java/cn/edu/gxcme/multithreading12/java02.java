package cn.edu.gxcme.multithreading12;

/**
 * Created by Administrator on 2017/3/24 0024.
 */
// 需求2人到银行存钱每次100共三次
public class java02 {
public static void main(String[] args)
    {
        da1 q = new da1();
        Thread m = new Thread(q);               // 注Thread 和 start 代码为固定代码  start意思为开启执行
        Thread m1 = new Thread(q);
        m.start();
        m1.start();
    }
}
class di{
    protected int zu;
     public synchronized void ii(int zhu)   // 同步函数
     {
    zu = zu + zhu;
        try {                                               // 22到26行代码不懂意思
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
        }
         System.out.println("zu="+zu);
     }
}
class da1 implements Runnable{
            protected di d = new di();
            public void run()       // 注意一定要调用run
            {
                for (int x=0;x<3;x++)
                {
                    d.ii(100);
                }
            }
}