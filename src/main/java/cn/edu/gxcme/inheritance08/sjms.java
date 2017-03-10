package cn.edu.gxcme.inheritance08;

/**
 * Created by Administrator on 2017/3/6 0006.
 */
public class sjms {         // 类
    private static sjms xx = new sjms();        // 类一加载，对象就已经存在   方法1   开发时用得多
    private sjms(){}
    public static sjms zhs()
    {
        return xx;
    }
    /*
    public class sjms2{                         // 方法2          延迟加载形式     面试时候用得多
     private static sjms xx = null;
     private sjms(){}
     public static sjms zhs()
            {
        if( s == null )
        s = newsjms2();
        return xx;
            }
    }

     */
    public static void main(String[] args)
        {
        sjms p = sjms.zhs();
        sjms p1 = sjms.zhs();
            System.out.println(p==p1);
        }
}
