package cn.edu.gxcme.study;

/**
 * Created by Administrator on 2017/4/19 0019.
 */
public class paixchaz01 {
    public static void main(String[] args){
        int [] arr={23,2,5,41,85,21,45,63};
        int xixi=xiao(arr,41);
        System.out.println("你要找的数的下标为："+xixi);
        paix(arr);
    }
    static int xiao(int []arr,int xx){          // 数的查找
        for (int x=0;x<arr.length;x++){
            if (arr[x]==xx)
                return x;
        }
        return -1;          // 如果没有要找的数则输出-1
    }
    static void paix(int []arr){            // 数的排列
        System.out.println("排序前：");
        for (int q=0;q<arr.length;q++){
            System.out.print(arr[q]+",");
        }
        for (int x=0;x<arr.length-1;x++){
            for (int p=x+1;p<arr.length;p++){
                if (arr[x]>arr[p]){
                    int zda=arr[x];
                    arr[x]=arr[p];
                    arr[p]=zda;
                }
            }
        }
        System.out.println();
        System.out.println("排序后：");
        for (int l=0;l<arr.length;l++){
            System.out.print(arr[l]+",");
        }
    }
}
