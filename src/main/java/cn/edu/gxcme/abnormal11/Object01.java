package cn.edu.gxcme.abnormal11;

/**
 * Created by Administrator on 2017/3/19 0019.
 */
public class Object01 extends Object {         // Object语句  后面的extends Object可不写
private int ags;
    Object01(int ags)
        {
            this.ags=ags;
        }
}
class zu
    {
        public static void main(String[] args)
        {
            Object01 object01 = new Object01(20);
            Object01 object011 = new Object01(20);
            System.out.println(object01==object011);
            Object01 object012 = object01;
            System.out.println(object01.equals(object012));
        }
    }