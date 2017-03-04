package cn.edu.gxcme.study06;

/**
 * Created by Administrator on 2017/3/3 0003.
 */
public class Fz01 {
    int e;
    public void r(int t)
    {
       if(t<0 || t>100)
       {
           System.out.println("错误");

       }
       else
       {
           e=t;
        System.out.println("年龄是"+t);
        }
    }
//    void w()
//    {
//        System.out.println("年龄="+e);
//    }
    public static void main(String[] args)
    {
        Fz01 a = new Fz01();            // 27-28-8-10-15-17-18
       a.r(10);
    }
}
