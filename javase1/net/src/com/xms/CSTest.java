//package com.xms;
//
//import java.io.*;
//import java.net.ServerSocket;
//import java.net.Socket;
//
///**
// * @author czw
// * @create 2021-06-24-下午 7:19
// */
//public class CSTest {
//    public static void main(String[] args) {
//        //通过传入Rannable实现类对象创建Thread对象
//        Thread t1 = new Thread(() -> {
//            try {
//                MyClient.sendMessage();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });
//        Thread t2 = new Thread(() -> {
//            try {
//                MyServer.receiveMessage();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });
//        //线程开始执行
//        t2.start();
//        t1.start();
//    }
//}
//class MyClient{
//    public static void sendMessage() throws IOException {
//        //绑定socket
//        Socket socket = new Socket("169.254.130.137",5555);
//        //通过socket对象的get方法获取该套接字的输出流
//        OutputStream os = socket.getOutputStream();
//        //将套接字的转换流包装为缓冲字符串输出流
//        BufferedOutputStream bw = new BufferedOutputStream(os);
//
//        //将标准输入流包装为缓冲输入流
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\资料\\资料" +
//                "\\jdk.API(1.6-1.9)\\JDK 1.6 API.chm");
//        BufferedInputStream bis = new BufferedInputStream(fis);
//        int len = -1;
//        byte[] buff = new byte[8192];
////        int count = 0;
//        while((len = bis.read(buff))!=-1){
////            System.out.println("第"+count+"次上传");
//            bw.write(buff,0,len);
////            count++;
//        }
//    /*    bw.flush();
//        bw.write("over".getBytes());
//        bw.flush();*/
//        //获取socket输入流并包装为缓冲字符输入流
//        BufferedReader brSoc = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        String s = null;
//        while(s==null) {
//            //读取服务端传来的数据
//            s = brSoc.readLine();
//        }
//        System.out.println(s);
//        bw.close();
////        br.close();
//        brSoc.close();
//        socket.close();
//    }
//}
//class MyServer implements MyWriter{
//    public  void receiveMessage() throws IOException {
//        ServerSocket ss = new ServerSocket(5555);
//        //调用serversocket对象的accept方法获取socket对象
//        Socket s = ss.accept();
//        //调用socket对象的get方法获取输入流
//        InputStream is = s.getInputStream();
//        //将is包装为缓冲字符流
//        BufferedInputStream bis = new BufferedInputStream(is);
////        String inputStr = null;
//        //获取客户端的IP地址和端口号
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\file\\JDK 1.6 API.chm"));
//        String clientAddress = s.getLocalAddress().getHostAddress();
//        int clientPort = s.getLocalPort();
//        write(bis, bos);
//
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
//        bw.write("上传成功");
//        bos.close();
//        bw.close();
//        bis.close();
//
//
//    }
//
//    @Override
//    public void write(InputStream is,OutputStream os) throws IOException {
//        byte[] buff = new byte[1024];
//        int len = 0;
////        int count = 0;
//        while((len = is.read(buff))!=-1){
////            System.out.println("第"+count+"次下载");
//            os.write(buff,0,len);
//            if(len<1024)
//                break;
////            count++;
//        }
//    }
//}
//
//interface MyWriter{
//    void write(InputStream is,OutputStream os) throws IOException;
//}