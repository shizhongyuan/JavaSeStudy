package cn.edu.gxcme.study06;

/**
 * Created by Administrator on 2017/3/3 0003.
 */
public class Gjhs {
    static class Gj{
        private String mz;          //构建函数
        private int sz;
        Gj()
        {
            mz="小黄";
            sz=13;
        }
        Gj(String n)
        {
            mz=n;

        }
        Gj(String n,int a)
        {
            mz=n;
            sz=a;
        }

        public void qq()
        {
            System.out.println(mz+"--"+sz);
        }


            }
            public static void main(String[]argi)
            {
                Gj a=new Gj();
                a.qq();
                Gj a1=new Gj("小黄",10);
                a1.qq();
            }
        }

