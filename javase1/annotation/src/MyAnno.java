import java.lang.annotation.*;

/**
 * @author czw
 * @create 2021-06-22-下午 4:45
 */
@Documented//描述注解可以被加载进doc文档里
@Inherited//描述注解可以被子类继承
//当前myAnno可以作用在类和方法上面
//如果属性名为value,value可以省略,如果数组里面只有一个元素,花括号也可以省略
@Target({ElementType.TYPE,ElementType.METHOD})//元注解:描述注解的注解
//当前MyAnno可以保留到程序运行的时候
@Retention(RetentionPolicy.RUNTIME)//SOURCE CLASS 描述注解可以保留到的阶段
public @interface MyAnno {
    boolean sex() default false;
    short age() default 18;
    String name() default "张三";
    MyMath mm();
    Anno anno();
    MyMath[] mmArr();
    int[] ids();
}
