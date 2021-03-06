package com.xms.day04;

import java.io.*;

/**
 * @author czw
 * @create 2021-06-18-上午 9:41
 */
public class StreamDemo01 {
    public static void main(String[] args) throws IOException {
        demo3();
    }
    private static void demo2(){
        PrintStream ps = System.out;
        ps.write(97);
        ps.println(97);
        ps.close();
    }
    private static void demo1() throws IOException {
        //标准输入流
        InputStream is = System.in;
        //读数据,从键盘录入的数据
        System.out.println("请输入数据");
        int by = is.read();
        System.out.println((char)by);
        //标准输入流只能读取一个字节或字节数组,现在想要读取一个字符串
        //需标准输入流进行封装;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入数据");
        br.readLine();
        String str = br.readLine();
        System.out.println(str);
        br.close();

        is.close();
    }
    private static void demo3() throws IOException {
        //改变标准输入输出流
        //需求:用"标准"输入流读取IO\\iofile\\1.txt内容,通过"标准"输出流写出到D:\\1c.txt中
        System.setIn(new FileInputStream(new File("IO\\iofile\\1.txt")));
        System.setOut(new PrintStream(new File("D:\\1c.txt")));
        int by = -1;
        while((by = System.in.read())!=-1){
            System.out.write(by);
        }
    }
}
