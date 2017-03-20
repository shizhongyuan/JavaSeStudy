package cn.edu.gxcme.abnormal11;

/**
 * Created by Administrator on 2017/3/17 0017.
 */
import cn.edu.gxcme.study.*;
public class Bao {      //包中的修饰符 public（可以对其它包直接访问）   protected (要其它包所继承才可用)
public static void main(String[] args)
    {
        Stu.xs stu = new Stu.xs();
        stu.sg = 120;
        stu.zj();

        System.out.println("----123----");
    }
}
