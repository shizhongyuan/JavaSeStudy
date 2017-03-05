package cn.edu.gxcme.dimensional07;

/**
 * Created by Administrator on 2017/3/4 0004.
 */
public class static01 {

    String age;         // 成员变量或实例变量
    static String gq= "中国";     //共享  注如果有对象相同则加 static直接加在前面 后面则赋值 这叫静态变量或类变量

     void o()

        {
        System.out.println("名字="+age+"国籍="+gq);
        }

            public static void main(String[] args)
    {
         static01 a = new static01();
                 a.age = "小强";
                 a.o();
    }
}
