package cn.edu.gxcme.final09;

/**
 * Created by Administrator on 2017/3/10 0010.
 */



/*
继承：
       2个类里边有同样的对象可用再弄个类出来写相同的部分做为父类
       不同的对象则写在子类里  用法 当子类要用父类的东西时候在子类类名后面加 extends 加父类名
 类：
        在里面要执行的命令和输出

        一类事物的总称，这类事物有着相同的属性和行为

 */

abstract public class cxaing01 {            // 注abstract抽象的意思
    /*
    工人：名字，号码，薪水
    经理：名字，号码，薪水，奖金
    */
    public String ags;      // 修饰符 public 默认值           25到27行的变量称为属性
    public int hm;
    public int xs;
    cxaing01(String ags,int hm,int xs)
        {
        this.ags=ags;
        this.hm=hm;
        this.xs=xs;
        }
    public abstract void pp();          // 类当中的行为也叫方法或者函数
}
class Gr extends cxaing01
{

    Gr(String ags,int hm,int xs)
    {
        super(ags,hm,xs);
    }

    public void pp()
        {
            System.out.println("------工作-----");
        }
}
class Jl extends cxaing01 {
    private int jj;
    Jl(String ags, int hm, int xs,int jj)
    {
        super(ags, hm, xs);
        this.jj=jj;
    }
    Jl()
    {
        super("看",20,80);
    }
    public void pp()                // 重载
        {
            System.out.println(ags);
        }
}
class zhu{
    public static void main(String[] args)
    {
        Jl p = new Jl("小",20,50,40);
        p.ags="小";          // 如果加public 外部可以直接访问
        p.hm=12;
        p.xs=56;
        p.pp();
 Jl p1 = new Jl();
 p1.pp();

    }
}
