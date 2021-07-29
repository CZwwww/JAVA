package com.xms;

import java.io.*;
import java.net.Socket;

/**数据来自控制台输入(System.in包装成BufferedReader)
 * 写出字符串数据(包装成BufferedWriter)
 * 数据可以发送多次,且有结束
 * 接收服务端的反馈信息
 * server
 * 接收客户端发送来的字符串数据
 * 收到客户端的结束标记后,给客户端反馈消息
 * @author czw
 * @create 2021-06-24-下午 5:44
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //绑定socket目标serverIP和Port
        Socket socket = new Socket("169.254.130.137", 6666);
        //获取socket输出流
        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        String str = "";
        //将标准输入流包装为缓冲字符输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            str = br.readLine();
            bw.write(str);
            bw.newLine();
            if("886".equals(str))
                break;
        }
//        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        byte[] bytes1 = new byte[512];
        int len = inputStream.read(bytes1);
        System.out.println(new String(bytes1,0,len));


        inputStream.close();
        bw.close();
        socket.close();
    }
}
