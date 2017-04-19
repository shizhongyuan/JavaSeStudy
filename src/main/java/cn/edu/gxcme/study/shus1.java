package cn.edu.gxcme.study;

/**
 * Created by Administrator on 2017/3/2 0002.
 */
public class shus1 {
    public static void main(String[]args)
    {
        Ss a=new Ss();
        a.rs=8;
        a.mz="小黄人";
        a.zj();


    }

  static class Ss
    {
        int rs;
        String mz;
        void zj()
        {
            System.out.print("rs="+rs+"mz="+mz);
        }
    }
}
