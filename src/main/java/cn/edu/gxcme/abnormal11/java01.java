package cn.edu.gxcme.abnormal11;

import java.util.Date;

/**
 * Created by Administrator on 2017/3/20 0020.
 */
public class java01  {
       private String Tsg;
       public java01(String Tsg) throws Yc
       {
           if (Tsg=="修路")
           {
                   throw new Yc("不可以去图书馆啦");
           }
           this.Tsg = Tsg;
           System.out.println(Tsg);
       }
public static void main(String[] args)
    {
            try {
                java01 java = new java01("修路");
            } catch (Yc yc) {
                yc.printStackTrace();
            }
    }
}
class Yc extends Exception
    {
        Yc(String Tsg)
        {
            System.out.println(Tsg);
            System.out.println("因为修路");
        }
    }
