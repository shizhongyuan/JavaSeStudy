package cn.edu.gxcme.final09;

import java.awt.geom.QuadCurve2D;

/**
 * Created by Administrator on 2017/3/10 0010.
 */
public class final01 {          // final 为固定数  比如说在一个程序里边的数是固定时就用这个
      final  int qq=1067164628;         //  账号固定意思
}
class zi extends final01{
     int x=123456;
     void zj()
    {
        System.out.println("账号"+qq+"  "+"密码"+x);
    }
    public static void main(String[] args){
        zi p = new zi();
        p.zj();
        }
}