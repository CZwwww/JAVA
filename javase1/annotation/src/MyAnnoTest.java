import org.junit.Test;

/**
 * @author czw
 * @create 2021-06-22-下午 5:18
 */
public class MyAnnoTest {
    @Test
    public void test(){

        int a = 0;
    }
    @MyAnno(sex=true,age=18,name="张三",mm=MyMath.GT,anno=@Anno("anno"),mmArr={MyMath.EQ,MyMath.GT},ids={1})
    public void running(){

    }
}
