package cn.edu.gxcme.final09;

/**
 * Created by Administrator on 2017/3/12 0012.
 */
public class Interface01 {          // interface 接口
    String name;                          // 接口的定义 public static final
     int sg;                               // 注类与类之间是继承，类与接口之间是实现，接口与接口之间是继承可多继承
Interface01(){                              // 类不可以多实现继承，但类可以多实现接口
    name = "旺财";
    sg = 130;
    }
}
interface Rr{
   public static final  String Cy = "抽烟";
}
class Rg extends Interface01 implements Rr{
    void R()
            {
            System.out.println("名字"+name+"身高"+sg+"行为"+Cy);
            }
        public static void main(String[] args)
        {
        Rg p = new Rg();
        p.R();
        }
    }
