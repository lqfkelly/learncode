package mln.lqf;

/**
 * 线程上下文类加载器一般使用模式（获取-使用-还原）
 * ClassLoader classloader = Thread.currentThread().getContextClassLoader();
 *
 * try{
 *     Thread.currentThread().setContextClassLoader(classloader);
 *     myMethod();
 * }finally{
 *     Thread.currentThread().setContextClassLoader(classloader);
 * }
 */
public class MyTest26 {
    public static void main(String[] args) {

    }
}
