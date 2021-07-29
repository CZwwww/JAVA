import java.lang.annotation.Annotation;

/**
 * @author czw
 * @create 2021-06-22-下午 8:01
 */
public class Test {
        @org.junit.Test
        public void test(){
            System.out.println("test Start");
            try {
                Class clazz = Class.forName("Student");




                Annotation[] annos = clazz.getAnnotations();
                for (Annotation anno : annos) {
                    System.out.println(anno);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

}
