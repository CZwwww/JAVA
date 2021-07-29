/**
 * @author czw
 * @create 2021-07-17-上午 10:23
 */
public class netWork {
    private int[] vertexes;
    private static class Vertex<E>{
        E data;

        Adjvex firstEdge;
    }
    private static class Adjvex{
        int vertex;
        int weight;
        Adjvex nextAdj;
    }
}
