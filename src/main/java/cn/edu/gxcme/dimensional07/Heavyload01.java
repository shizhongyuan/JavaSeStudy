package cn.edu.gxcme.dimensional07;

/**
 * Created by Administrator on 2017/3/4 0004.
 */
public class Heavyload01 {          //重载
        int sm;
        private  void e(int s)          // 函数封装
        {
            if (s<0 || s>100)
            {
                System.out.println("错误");
            }
            else
                {
               sm=s;
          System.out.println("年龄="+s);
                }
        }
        String mz;
        void q()
    {
        System.out.println("年龄="+sm+"名字="+mz);
    }
public static void main(String[] args)
        {
            Heavyload01 a = new Heavyload01();
          a.e(110);
            a.mz="蓝";
            a.q();
        }

}
