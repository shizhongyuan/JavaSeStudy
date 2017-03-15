package cn.edu.gxcme.polymorphism10;

/**
 * Created by Administrator on 2017/3/14 0014.
 */
public abstract class Polymorphism02 {
    public abstract void chi();
}
class Ca extends Polymorphism02     // 猫
{
    public void chi()
    {
        System.out.println("吃菜");
    }
    public void ci()
        {
            System.out.println("捉老鼠");
        }
}
class Zhu
{
    public static void main(String[] args)
    {
   Polymorphism02 q = new Ca();// 这种调用叫向上转型 注如果用该调用就不可调出猫的特有行为 （public void ci()）不可调
         q.chi();                   // 作用就是限制对特有功能的访问
      /*  Ca q = new Ca();
        q.chi();
        q.ci();
       */
      Ca c = (Ca)q;         // 向下转型  注可以调用出猫的全部特有行为
      q.chi();              // 作用不限制对特有功能的访问
      ((Ca) q).ci();
    }
    public static void qq(Polymorphism02 y)
    {
        y.chi();
    }
}