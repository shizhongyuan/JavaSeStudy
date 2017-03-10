package cn.edu.gxcme.inheritance08;

/**
 * Created by Administrator on 2017/3/6 0006.
 */
public class data01 {       // 数据
    /*  public static void main(String[] args)
      {
          int[] arr = {1,2,5,4,12,52,10,30};           //  简单的数组中打印最大值方法1 少用
          int zd = 0;
      for (int x=1;x<arr.length;x++)
          {
              if (arr[x] > arr[zd])
                      zd=x;
          }
          System.out.println("最大="+arr[zd]);
      }
  */

    public static void main(String[] args)                        // 函数在数组中打印最大值方法2
    {
        int[] arr = {1,2,5,4,12,502,10,30};
        int max=xx(arr);
            System.out.println("最大="+arr[max]);
    }
public static int xx(int[] arr)
        {
            int zd = 0;
            for (int x=1;x<arr.length;x++)
            {
                if (arr[x] > arr[zd])
                    zd=x;
            }
            return arr[zd];
        }
}
