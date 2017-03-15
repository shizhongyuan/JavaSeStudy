package cn.edu.gxcme.polymorphism10;

/**
 * Created by Administrator on 2017/3/14 0014.
 */
public class zuanxing01 {               // 成员变量
    int x = 3;
}
class Zi extends zuanxing01
    {
    int x = 5;
    }
    class z
        {
   public static void main(String[] args)
   {
       zuanxing01 p = new Zi();   // 面试多见
       System.out.println(p.x);   //  特点：编译和运行都看左边（zuanxing01） 如有成功没有失败
   }
        }


class Fu                // 成员函数（非静态）
{
    void xi()
    {
        System.out.println("fu");
    }
}
class Zu extends Fu
{
    void xi()
    {
        System.out.println("Zu");
    }
}
class d
{
    public static void main(String[] args)
    {
        Fu l = new Zu();            // 重点
        l.xi();                     //  特点：编译看左边（Fu） 运行看右边（Zu）
    }
}


class F         // 静态函数      静态修饰符static
{
    void x()
    {
        System.out.println("F");
    }
    static void u()
        {
            System.out.println("u");
        }
}
class Z extends F
{
    void x()
    {
        System.out.println("Z");
    }
    static void u()
        {
            System.out.println("i");
        }
}
class zh
{
    public static void main(String[] args)
    {
        F m = new Z();
        m.u();              // 特点：编译和运行都看左边（F）
    }
}