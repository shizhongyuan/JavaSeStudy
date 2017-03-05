package cn.edu.gxcme.dimensional07;

/**
 * Created by Administrator on 2017/3/4 0004.
 */
public class Heavyload02 {
    int Age;   //年龄
    String Name;       //名字
    Heavyload02()        //自己
            {                   // 构造函数
        Age =100;
        Name ="蓝";                                                // 定义名字 年龄x和y
            }
   Heavyload02(String x,int y)                         //可以写成  Heavyload02(String Name,int Age)
   {
       Name = x;                                      // this.Name = Name     this(对象)
        Age = y;                                     //  this.Age = Age
   }
    void ap()
    {
        System.out.println("年龄="+Age+"名字="+Name);
    }
        public static void main(String[] args)
        {
    Heavyload02 m = new Heavyload02();
            m.ap();
    Heavyload02 m1 = new Heavyload02("小环",138);
            m1.ap();

        }
}
