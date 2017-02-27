package cn.edu.gxcme.study;

import java.lang.reflect.Array;

/**
 * Created by Administrator on 2017/2/20 0020.              //    数 组
 */
public class Xiaoshu {
    public static void main(String[] args) {
    /*    int [] app=new int[5];          // 需要一个容器，不知道里面具体的值
    app[3]=33;
        System.out.println(app[3]);     */

   /* int [] app=new int[]{12,34,67,23,56,67};   //或int []app={12,34,67,23,56,67};    //需要一个容器，知道里面具体的值


     //   System.out.println("length:"+app.length);   //  这个打印主要知道数组里面的数的个数


        for (int x=0;x<app.length;x++)
        {
            System.out.print("app["+x+"]="+app[x]+";"+"\t");
        }*/

    /*    int[] arr = {21, 23, 4, 343, 123, 54, 342, 34, 221};          // 数组打印的最值

        int max= get(arr);
    System.out.println("max="+max);
    }

    static int get(int[] arr)
     {
        int max = 0;
        for (int x = 0; x < arr.length; x++)
        {
            if (arr[x]>max)
                max = arr[x];
        }
        return  max;
        */


        int[] arr = new int[]{23, 123, 12, 43, 432, 213, 876, 8, 7, 687, 678};       //数组打印的排序
        xiaoshu(arr);

        for (int x = 0; x < arr.length; x++)
        {

            System.out.print(arr[x] + ",");
        }

    }

      static void xiaoshu(int[] arr)
      {
        for (int x=0;x<arr.length-1;x++)
    {
        for (int y=x+1;y<arr.length;y++)
        {
            if (arr[x]>arr[y])
            {
                int ta=arr[x];
                arr[x]=arr[y];
                 arr[y]=ta;
            }
        }
    }
    }
}
