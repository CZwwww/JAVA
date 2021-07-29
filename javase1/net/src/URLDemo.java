import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author czw
 * @create 2021-06-25-下午 2:22
 */
public class URLDemo {
    public static void main(String[] args) {

        HttpURLConnection urlConnection = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            URL url = new URL("http://localhost:8080/examples/beauty.png?userName=tom");
            //获取资源路径
            url.getPath();
            //获取查询条件如果没有返回null
            url.getQuery();
            //获取资源路径加查询条件
            url.getFile();

            urlConnection = (HttpURLConnection) url.openConnection();

//        urlConnection.connect();


            is = urlConnection.getInputStream();
            fos = new FileOutputStream("D:\\beauty3.png");

            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }

            System.out.println("下载完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }
    }
}