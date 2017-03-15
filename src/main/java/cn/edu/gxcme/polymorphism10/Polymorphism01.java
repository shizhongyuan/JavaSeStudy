package cn.edu.gxcme.polymorphism10;

/**
 * Created by Administrator on 2017/3/13 0013.
 */
public abstract class Polymorphism01 {                   // polymorphism 多态
    abstract void chi();
}
 class Dog extends Polymorphism01  // 狗
    {
    void chi()
        {
            System.out.println("狗"+"吃猪");
        }
    }
 class Pig extends Polymorphism01 // 猪
        {
        void chi()
            {
                System.out.println("猪"+"吃猫");
            }
        }
  class Cat extends Polymorphism01     // 猫
    {
    void chi()
        {
            System.out.println("猫"+"吃小树");
        }
    }
class zhu
{
    public static void main(String[] agsr)
    {
        pp(new Dog());
        pp(new Pig());
        pp(new Cat());
    }
    public static void pp(Polymorphism01 x)
        {
        x.chi();
        }
}