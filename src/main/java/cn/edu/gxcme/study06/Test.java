package cn.edu.gxcme.study06;

/**
 * Created by Administrator on 2017/3/2 0002.
 */
public class Test {
    public static void main(String[] args)
    {
        Student  st;
        st = new Student();
        st.name="小";
        st.age=16;
        st.haveaClass();

        Student s1;
        Student s2;

        Teacher teacher=new Teacher();
        teacher.course="计算机";
        teacher.name="黄";
        teacher.teaching();

        Teacher t1;
        Teacher t2;
        t2=new Teacher();

       Animal animal = new Animal();
        animal.color1="白色";
        animal.color2="黑色";
Animal a1;
a1=new Animal();



    }

}
