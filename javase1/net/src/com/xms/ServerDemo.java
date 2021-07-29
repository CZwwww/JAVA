package com.xms;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author czw
 * @create 2021-06-24-下午 5:35
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        //侦听并接收客户端的连接
        Socket socket = ss.accept();
        InputStream inputStream = socket.getInputStream();

        byte[] buff = new byte[1024];
        int len = inputStream.read(buff);
//        socket.shutdownInput();
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("helloClient".getBytes());
        outputStream.flush();

        System.out.println(new String(buff,0,len));
        outputStream.close();
        inputStream.close();
        socket.close();
    }
}
