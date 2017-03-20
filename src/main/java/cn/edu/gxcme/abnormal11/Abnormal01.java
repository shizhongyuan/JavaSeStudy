package cn.edu.gxcme.abnormal11;

/**
 * Created by Administrator on 2017/3/16 0016.
 */
public class Abnormal01 {                           // abnormal 异常
/*
运行电脑 上课
*/
private int dn = 1;
public void Dn()throws lanp,maoy
    {
        if (dn==1)
            throw new lanp("电脑蓝屏啦");
        if (dn==2)
            throw new maoy("电脑冒烟啦");
        System.out.println("电脑运行");
    }
    public void p()
    {
        dn=0;
        System.out.println("电脑重启");
    }
}
class lanp extends zhu
    {
    lanp(String lp)
        {
    super();
        }
    }
class maoy extends zhu
{
    maoy(String lp)
    {
        super();
    }
}
class Wo
{
    private String name;
    private Abnormal01 q;          // 不懂 为什么要私有这个类
    Wo(String name)
    {
        this.name=name;
        q = new Abnormal01();
    }
    void Vo() throws maoy
    {
        try {
            q.Dn();
            System.out.println("上课");
        }
        catch (lanp e)
        {
           // System.out.println(e.toString());
            e.printStackTrace();
            q.p();
             Vo();
        }
        catch (maoy e)
        {
            System.out.println(e.toString());
            zx();
            throw e;
        }
    }
    public void zx()
    {
        System.out.println("自学");
    }
}
class zhu extends Exception                                  // java.lang.Throwable
{
    public static void main(String[] mags)
    {
        Wo a = new Wo("小石");

        try {
            a.Vo();
        }
        catch (maoy e)
        {
            System.out.println("........");
        }
    }
}
