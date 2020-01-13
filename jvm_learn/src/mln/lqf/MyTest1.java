package mln.lqf;

/**
 * 对于静态字段来说，只有直接定义了该字段的类才会被初始化；
 * 当一个类在初始化时，要求其父类全部都已经初始化完毕
 */
public class MyTest1 {
    public static void main(String[] args) {
        //System.out.println(MyParent1.str1);
        System.out.println("---------------------");
        System.out.println(MyChild1.str2);
    }
}

class MyParent1{
    public static String str1 = "hello world";
    static{
        System.out.println("MyParent1 static block");
    }
}

class MyChild1 extends MyParent1{
    public static String str2 = "welcome";
    static {
        System.out.println("MyChild1 static block");
    }
}
