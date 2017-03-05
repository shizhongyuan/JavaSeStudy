package cn.edu.gxcme.dimensional07;

/**
 * Created by Administrator on 2017/3/5 0005.
 */
public class static02 {
    String mz;
    {                   // 第8到10行为构造代码块
        zj();
    }

    static02()
        {
        mz="土匪";
        }
        public void r()
            {
            System.out.println("名字："+mz);
            }

        static02(String mz)
        {
            this.mz=mz;
        }
        public void t()
            {
                System.out.println("名字："+mz);
            }
   public void zj()
    {
        System.out.println("哇哇");
    }
   public static void main(String[] args)
    {
        static02 p = new static02();
        p.r();
        static02 p1 = new static02("旺财");
        p1.t();
    }

}
