package cn.edu.gxcme.final09;

/**
 * Created by Administrator on 2017/3/13 0013.
 */
public class Interface0102 {
/*
U盘的使用
1，电脑定义插口
2，当插进去显示，拔出来不显示
*/
public static void main(String[]args)
        {
        up(new upan());        // 4，noe 就是调出来的意思
        }
    public static void up(USB x)         // 3，定义一个类参数把要可能发生的事件写出来
    {
        x.xs();
        x.bxs();
    }
}
    interface USB               // 1，先定义一个接口 UBS的表现 xs（显示）与bxs（不显示）
        {
        public void xs();
        public void bxs();
        }
    class upan implements USB         // 2，定义一个类继承上面的接口 当输入xs时输出显示 当输入bxs时输出不显示
    {
        public void xs()
        {
            System.out.println("显示");
        }
        public void bxs()
        {
            System.out.println("不显示");
        }
    }