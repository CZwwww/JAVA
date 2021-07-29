/**
 * @author czw
 * @create 2021-06-22-下午 4:39
 */
public class AnnotationDemo {
    public static void main(String[] args) {
        Son s = new Son();
        s.stop();
    }

}
abstract class Fu{
    public abstract void show();
}
class Son extends Fu{
    @Override
    public void show() {

    }

    /**
     * 该方法已过时,请使用termainate();
     */
    @Deprecated
    public void stop(){}

    public void termainate(){}
}
