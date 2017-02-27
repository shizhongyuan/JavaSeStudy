package cn.edu.gxcme.study;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;           //   语 句

import java.util.SortedMap;

/**
 * Created by Administrator on 2016/12/18 0018.
 */

public class HaHa {
    public static  void main(String[]args)
    {
       //byte   a=5;          //(-128到127)
                    // short	n = 4000;       （-32768到32767）
       // int	m = 12;     (-2147483648到2147483647)
                    // long	j = 123456;     (天数)
       // float	k =2.3f;     （浮点类型）
                    // double	l = 3.4;        （浮点类型）（小数点的加法）
        // char	i = 'a';        （字符型）
             // MAX VALUE  最大值
            // MIN VALUE  最小值

       //  +(连续符) “。”
            /*
           与：&
           或：|
           */
        //int  a=8;
       // b=a++;
                //b=9;
        //System.out.println("a="+a+".b="+b);
        /*int a=6,b=5;        //数的转换
         System.out.println("a="+a+".b="+b);
         int c;
        c=a;
        a=b;
        b=c;
        System.out.print("a="+a+",b="+b);*/
       /* int a=2,b;   //三元运算
        b=(a>3)?150:250;   //如果真（true）结果150（前面）
                            //如果假（false）结果250（后面）
        System.out.println("b="+b);*/

       /* int a=9,b,c=8;

        int b=a>8?10:7;

        int y=b<c?100:200;  //三个数的比较

        System.out.println("y="+y);*/
      /* int x=1;  //语句1
       if(x>7)
       if(x<0)
       {
           System.out.println("yes");
       }
            System.out.println("over");*/
    /* int a=2;  //语句2
        if(a>3)
        {
            System.out.println("yes");
        }
        else {  //如果不成立则运行下面
            System.out.println("over");*/
    /*int a=6;   //语句3
     if(a>7)
     System.out.println("xiaoshi");
     else if(a>6)
     System.out.println("xiaoshu");
     else if(a>5)
         System.out.println("xiaoshishu");
     else
         System.out.println("xiaoshushi");*/
    /* int week=8;        //根据用户给的数字转成对应的星期
     if(week==1)
         System.out.println(week+"是星期一");
     else if(week==2)
            System.out.println(week+"是星期二");
     else if(week==3)
            System.out.println(week+"是星期三");
     else if(week==4)
            System.out.println(week+"是星期四");
     else if(week==5)
            System.out.println(week+"是星期五");
     else if(week==6)
            System.out.println(week+"是星期六");
     else if(week==7)
            System.out.println(week+"是星期日");
     else
         System.out.println(week+"没有该星期");*/
   /* int xiao=5;   //根据用户给的数字转成对应的季节
        if(xiao<1 || xiao>12)
            System.out.println(xiao+"没有对应的季节");
        else if(xiao>=2 && xiao<=4)
            System.out.println(xiao+"月对应春季");
        else if(xiao>=5 && xiao<=8)
            System.out.println(xiao+"月对应夏季");
        else if(xiao>=9 && xiao<=11)
            System.out.println(xiao+"月对应秋季");
        else
            System.out.println(xiao+"月对应冬季");*/
  /* int a = 11;      //语句-switch 数字
            switch (a+12)
            {
                case12:
            System.out.println("a");
            break;
                case 13:
             System.out.println("12306");
                break;
                default:
             System.out.println("无法执行");
        }*/
      /* int xs =8 ;          //用户给的数据用switch表达
            switch (xs)
            {
                case 12:
                case 1:
                case 2:
                    System.out.println(xs+"对应春季");
                    break;
                case 3:
                case  4:
                case 5:
                    System.out.println(xs+"对应夏季");
                    break;
                case 6:
                case 7:
                case  8:
                    System.out.println(xs+"对应秋季");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(xs+"对应冬季");
                    default:
                        System.out.println(xs+"没有对应的季节");
            }*/
    /* int x=3;      //while 循环语句
      while(x<5)
      {
          System.out.println("x="+x);
          x++;
      }
      int y=2;      //do whhile 必须执行do输出在执行while
      do {
          System.out.println("y="+y);
          y++;
      }
      while (y<4);

      int w=1;      //while 语句的累加
      int he=0;
      while (w<=10)
        {
            he=he+w;
            w++;
        }
        System.out.println("he="+he);*/
      /* int x=1;    //1到100中8的倍数出现的次数
        int xx=0;
        while (x<=100)
        {
            if (x%8==0)
            xx++;
            x++;
        }
        System.out.println("xx="+xx);*/

        /*for (int z=3,c=5;z>1 && c<7;z--,c++)   //用 for 的简单循环
        {
            System.out.println("z="+z+".c="+c);
        }


        int vv=0;           //用 for 方法累加 1到10的数
        {
        for (int v=1;v<11;v++)
            vv =vv+v;

        }
        System.out.println("vv="+vv);*/

        for (int x=0;x<4;x++)       // for循环嵌套   类型1
        {
            for (int y=1;y<6;y++)
            {
                System.out.print("小树梅");
            }
            System.out.println();
        }
        System.out.println("--------------------");

        for (int z=1;z<=5;z++)             // for循环嵌套   类型2
        {
            for ( int c=z;c<=5;c++)
            {
                System.out.print("$");
            }
            System.out.println();
        }
        System.out.println("--------------------");

        for (int w=1;w<=5;w++)          //for循环嵌套   类型3
        {
            for (int e=5;e>=w;e--)
            {
                System.out.print(e);

            }
            System.out.println();
        }

        System.out.println("--------------------");

        for (int d=1;d<=5;d++)          //for循环嵌套   类型4
        {
            for (int f=1;f<=d;f++)
            {
                System.out.print(d);
            }
            System.out.println();
        }

        System.out.println("--------------------");

        for (int b=1;b<=9;b++)          //for循环嵌套   类型5
        {
            for (int n=1;n<=b;n++)
            {
                System.out.print(n+"*"+b+"="+n*b+"\t");
            }
            System.out.println();
        }

        for (int t =5;t>=1;t--)       //for循环嵌套   类型6       如要改变图像方向只改for(int t = 1;t<=5;t++)
        {
            for (int u =1;u<t;u++)
            {
                System.out.print(" ");
            }

            for (int i = t; i <= 5; i++)
            {
                System.out.print("* ");
            }
                    System.out.println();
        }




        }
        }

