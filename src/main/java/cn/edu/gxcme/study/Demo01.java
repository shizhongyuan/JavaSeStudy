package cn.edu.gxcme.study;

/**
 * Created by Administrator on 2017/3/1 0001.
 */
public class Demo01 {
    public static void main(String[] args){

        House h  = new House();  //  h 某个具体的房子
          h.age = 5;
        h.c = "白色";

        h.rendering();

    }
}

class House {
    int age ;    String c ; // 颜色

    //  房子5年前，被粉刷为白色
   void rendering(){
       System.out.println("房子 "+age+" 年前，被粉刷为 "  + c);
   }

}
