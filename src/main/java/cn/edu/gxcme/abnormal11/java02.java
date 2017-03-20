package cn.edu.gxcme.abnormal11;

/**
 * Created by Administrator on 2017/3/20 0020.
 */
                // 定义一个数这个数不可以超过100 如超过100报出异常
public class java02 {
    private int shu;
    public java02(int shu) throws yy
    {
        if (shu>100)
        {
            throw new yy("你输入的数不符合规定");
        }
        this.shu = shu;
        System.out.println(shu);
    }
public static void main(String[] args)
    {
             try {
                 java02 p = new java02(101);
             } catch (cn.edu.gxcme.abnormal11.yy yy) {
                 yy.printStackTrace();
             }
    }
}
class yy extends Exception
    {
        yy(String yy)
        {
            System.out.println(yy);
            System.out.println("输入小于100的数");
        }
    }