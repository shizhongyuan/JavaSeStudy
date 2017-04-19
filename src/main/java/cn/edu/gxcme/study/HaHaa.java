package cn.edu.gxcme.study;

/**
 * Created by Administrator on 2017/2/27 0027.
 */
          // 面向对象
                              /*      特点：
                                                1，面向对象就是一种常见的思想。符合人们的思考习惯
                                                2，面向对象的出现，将复杂的问题简单化
                                                3,,面向对象的出现，让曾经在过程中的执行者，变成了对象中的指挥者*/

/**
 *    树  ： 描述的一类事物
 */
class Car01
{
    // 方法，或 函数
    int num(){
        System.out.println(" ================= ");
        return 1;
    }
    String color; // 变量
    void run()
    {
        int res =  num();
        System.out.println("..."+color);
    }
}

class  Car
{
    public static void main(String[] args)
    {
        Car01 c = new Car01();

    }
}
