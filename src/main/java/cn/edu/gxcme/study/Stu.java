package cn.edu.gxcme.study;

/**
 * Created by Administrator on 2017/3/1 0001.
 */
public class Stu {  // 学生
    public static void main(String[]args)
    {
        xs a=new xs();
        a.sg=185;
        a.mz="小石";
        a.nl=16;
        a.xx="学校";
        a.xb="计算机";
        a.nj=2;

        a.zj();
        a.lt();
    }

   public static class xs
    {
       public int sg ;
      String mz;
      int nl;
      String xx;
      String xb;
      int nj;
   public void zj()
   {
       System.out.println("名字"+mz+"----"+"身高"+sg);
   }
   void lt()

   {
       for (int x=1;x<6;x++)
       {
          //  lt(4);

           System.out.println("我"+x);
       }
   }
    }
}
