package cn.edu.gxcme.study;

/**
 * Created by Administrator on 2017/5/1 0001.
 */
public class pinln00 {
    public static void main(String[] args){
        nf(2016);
    }
    public static void nf(int xx){
        if (xx%4==0 && xx%100!=0 || xx%400==0){
            System.out.println(xx+"为闰年");
        }
        else {
            System.out.println(xx+"为平年");
        }
    }
}
