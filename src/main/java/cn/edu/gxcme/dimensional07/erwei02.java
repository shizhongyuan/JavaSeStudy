package cn.edu.gxcme.dimensional07;

/**
 * Created by Administrator on 2017/3/3 0003.
 */
public class erwei02 {
    public static void main(String[]aigr)
    {
        int sun=0;
        int [][] arr={{2,5,4},{3,6,8},{9,7,}};             // 二维数组的简单加法的输出
        for (int x=0;x<arr.length;x++)
        {
            for (int y=0;y<arr[x].length;y++)
            {
               sun+=arr[x][y];
            }
        }
        System.out.print("sun="+sun);
    }
}
