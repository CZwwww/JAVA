package com.xms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author czw
 * @create 2021-06-24-下午 2:51
 */
public class ReceiveDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String savePosition = "IO\\iofile\\udp.txt";
        String str = scan.next();
        //通过将Rannable实现类对象传入Thread构造方法创建线程
        Thread t1 = new Thread(() -> {
            try {
                while(!"886".equals(str)) {
                    send(str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                receive(savePosition);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        //线程开始执行
        t2.start();
        t1.start();
    }
    private static void send(String str) throws IOException {
        //创建绑定任意端口的数据报套接字
        DatagramSocket ds = new DatagramSocket();
        //创建缓冲区
        byte[] buff = str.getBytes();
        //创建数据报包,打包数据发送到目标ip 端口
        DatagramPacket dp = new DatagramPacket(buff, buff.length, InetAddress.getByName("localhost"),5000);
        //调用send方法发送
        ds.send(dp);
        ds.close();
    }
    private static void receive(String str) throws IOException {
        //创建绑定在5000端口的数据报套接字对象用于接收数据
        DatagramSocket datagramSocket = new DatagramSocket(5000);
        //创建缓冲区
        byte[] buf = new byte[1024];
        //创建数据报包对象用于接收数据报包并解析
        DatagramPacket packet = new DatagramPacket(buf, 1024);
        BufferedWriter bw = new BufferedWriter(new FileWriter(str));
        while(true){
            //通过receive方法接收数据报包
            datagramSocket.receive(packet);
            //调用getData方法获取缓冲区数据
            byte[] data = packet.getData();
            //调用getLength方法获取数据报包容量
            int len = packet.getLength();
            //调用String的构造方法将数据报包缓冲区数据转为String类型
            String message = new String(data, 0, len);
            //如果该信息是"886"则退出循环
            if("886".equals(message))
                break;
            //将得到的字符串数据写入给定路径的文件
            bw.write(message);
            bw.newLine();
        }
        datagramSocket.close();
        bw.close();
    }
}
