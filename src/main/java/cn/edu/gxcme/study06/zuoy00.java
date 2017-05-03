package cn.edu.gxcme.study06;

/**
 * Created by Administrator on 2017/5/3 0003.
 */
public class zuoy00 {
    public static void main(String[] args){
        zhu(10.5);
    }
    public static void zhu(double x){
        if(x<=3 && x>0){                // 0到3小时的收费
            int i=5;
            System.out.println("你的费用为"+i+"元"+"  "+"停车"+x+"小时");
        }
        if (x>3){                       // 大于3小时的收费
            int i=5;
            int q = 0;                  // 大于3小时后 没小时收费数
            for (int xx=0;xx<x-3;xx++){
                q++;
            }
            int qq=i+q;                  //  总共收费的数
            if (qq<=20){                 // 收费少20元打印 否则出错
            System.out.println("你的费用为"+qq+"元"+"  "+"停车"+x+"小时");
            }
            else {
                System.out.println("超过20元了 出错");
            }
        }
    }
}
