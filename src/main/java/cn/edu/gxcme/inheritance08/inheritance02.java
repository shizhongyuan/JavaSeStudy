package cn.edu.gxcme.inheritance08;

/**
 * Created by Administrator on 2017/3/7 0007.
 */
public class inheritance02 {                // 对象的继承  当对象名相同的时候 注意 输出子要加this.  父要加super.
    int nus;
}
class fu
    {
    int nus=5;
    }
class zi extends fu
        {
    int nus=10;
    void ags()
    {
        System.out.println(this.nus+"----"+super.nus);
    }
        }
class zhuhans
{
    public static void main(String[] args)
    {
        zi p = new zi();
        p.ags();
    }
}