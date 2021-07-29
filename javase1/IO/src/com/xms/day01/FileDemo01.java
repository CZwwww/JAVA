package com.xms.day01;

import java.io.File;
import java.io.IOException;

/**
 * JavaSE中资源的路径表示
 * 1)绝对路径,以盘符开始
 * 2)相对路径
 * Eclipse中以当前项目路径开始(不需要写)
 * Idea中以当前Module路径开始
 * @author czw
 * @create 2021-06-16-下午 2:06
 */
public class FileDemo01 {
    public static void main(String[] args) throws IOException {
//        File f1 = new File("D:"+ File.separator+"1.txt");
//        File f2 = new File("IO"+File.separator+"iofile"+File.separator+"1.txt");
//        f2.createNewFile();
//        f1.createNewFile();
//        //2)通过父路径和子路径创建file
//        File f3 = new File("D:"+File.separator+"demo");
//        File f4 = new File(f3,"1.txt");
//        File f1 = new File("D:\\a\\b\\c\\d\\e");
//        f1.mkdirs();
//        File f = new File("D:\\a");
//        delete(f);

    }

    private static void delete(File f1) {
        if(!f1.exists()){
            throw new RuntimeException("文件或文件夹不存在");
        }
        if(f1.isFile()){
            f1.delete();
        }else{
            File[] arr =
                    f1.listFiles();
            for(int i=0;i<arr.length;i++){
                delete(arr[i]);
            }
            f1.delete();
        }

    }
}
