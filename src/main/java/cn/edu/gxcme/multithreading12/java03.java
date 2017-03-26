package cn.edu.gxcme.multithreading12;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/25 0025.
 */
public class java03 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);            // 固定代码
        //sc.nextInt();
        while (true) {
            System.out.println("请输入你要查看的星期课程（如想看星期1请输入1）：");
            int xb = sc.nextInt();           // 固定代码
//            System.out.println("你的姓名");
//            double sg = sc.nextDouble();
//            System.out.println("你的密码");
//            double tz = sc.nextDouble();
             if (xb == 1) {
                int x = sc.nextInt();
                System.out.println("8:00——9:30上程序设计基础A 教室在4401");
                System.out.println("9:40——11:10上思想道德修养与法律基础 教室在5201");
                System.out.println("14:40——16:10上高等数学 教室在5301");
             }
        else if (xb == 2) {
            System.out.println("8:00——9:30上Flash动画制作 教室在5502");
            System.out.println("10:30——12:00上体育 教室在篮球场");
            System.out.println("19:30——20:50上网页布局B 教室在4302");
        } else if (xb == 3) {
            System.out.println("10:30——12:00上大学英语|| 教室在1403");
            System.out.println("14:40——16:10上高等数学 教室在5301");
            System.out.println("16:20——17:50上程序设计基础A 教室在4401");
            System.out.println("19:30——20:50自习 教室在东6103");
        } else if (xb == 4) {
            System.out.println("9:40——12:00上Photoshop高级图像处理 教室在5501");
            System.out.println("14:40——16:10上Flash动画制作 教室在5502");
            System.out.println("16:20——17:50上网页布局B 教室在4302");
        } else if (xb == 5) {
            System.out.println("8:00——9:30上大学英语|| 教室在1403");
            System.out.println("10:30——12:00上思想道德修养与法律基础 教室在1202");
            System.out.println("14:40——17:00上计算机组装与维修 教室在4302");
        }
        else {
                break;          // 结束 跳出
            }
    }
        System.out.println(" 结束 ");
    }
}

