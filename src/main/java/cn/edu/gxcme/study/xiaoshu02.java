package cn.edu.gxcme.study;

import java.io.FileOutputStream;

/**
 * Created by Administrator on 2017/2/26 0026.
 */
public class xiaoshu02 {
    public static void main(String[] args) {

      /*  int [] arr={12,23,52,54,92,65,41,58,122};//  基本的数组查找

            int mei=xiao(arr,41);
        System.out.println("mei="+mei);
    }
    static int xiao(int [] arr,int shu)
    {
        for (int x=0;x<arr.length;x++)

        {
            if (arr[x]==shu)
            return x;
        }
        return -1;      //  当数组中没有那个数的时候打印 -1
        */



      int [] arr={1,5,8,9,12,41,65,85,98,101,106};
        int xx=xi(arr,65);

        System.out.println("xx="+xx);

    }
    static int xi(int []arr,int xu)
    {
        int mxiao,mda,mzhong;
        mda=0;
        mxiao=arr.length-1;
        mzhong=(mda+mxiao)>>1;

        while (arr[mzhong]/2!=xu)
        {
         if (xu>arr[mzhong])
             mda=mzhong+1;
         else if (xu<arr[mzhong])
             mxiao=mzhong-1;
            return mda;
        }
        return -1;
    }


}
