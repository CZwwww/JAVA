package com.xms.day02;

/**
 * 4、根据传入得路径，获取文件名。例如：D:\myfile\hello.java取出hello.java
 * 5、根据传入得路径，获取文件的类型名。例如：D:\myfile\hello.java取出.java
 * 6、编写java程序，随便输入两个单词，两个单词之间以空格隔开，
 * 输出时每个单词的首字母变为大写。如输入：“hello java”，输出为“Hello Java”
 * @author czw
 * @create 2021-06-09-下午 2:10
 */
public class SubDemo {
    public static void main(String[] args) {
        String path = new String("D:\\myfile\\hello.java");
        String path1 = new String("D:\\myFile\\hello.java");
        printTypeName(path);
        printFileName(path1);
        String s = "   abce sds    ";
        String s1 = myTrim(s);
        System.out.println(s1);
        String s2 = "12345678";
        String s3 = myReverse(s2,3,7);
        System.out.println(s3);
        String str = "java world";
        String str2 = toUpperCase(str);
        System.out.println(str2);
        String s4 = "woaixuexiaigongzuoaijiaaidangaishehui";
        System.out.println(count(s4,"ai"));
        System.out.println("aaa".compareTo("acc"));//从第一个字符开始依次比较,如果相等比较下一个字符如果不相等返回字符差
        System.out.println("aaa".compareTo("aacbc"));//如果一个字符串由另一个字符起始,比较的是字符串长度差
    }
    public static void printTypeName(String path){
        String[] arr = path.split("\\.");
//        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);
    }
    public static void printFileName(String path){
        String[] arr = path.split("\\\\");
        System.out.println(arr[arr.length-1]);
    }
    public static String myTrim(String str){
        char[] chArr = str.toCharArray();
        int begin = 0;
        int end = chArr.length-1;
        boolean[] flags = {true,true};
        for(int i=0;i<chArr.length;i++){
            if(flags[0]&&chArr[i]!=' '){
                flags[0] = false;
                begin = i;
            }
            if(flags[1]&&chArr[chArr.length-1-i]!=' '){
                flags[1] = false;
                end = chArr.length-1-i;
            }
        }
        if(flags[0]){
            return "";
        }
        return str.substring(begin,end);
    }
    public static String myReverse(String str,int begin,int end){
        if(end>str.length()||begin<0){
            throw new ArrayIndexOutOfBoundsException("超范围了");
        }
        char[] arr = str.toCharArray();
        for(;begin<end;begin++,end--){
            char temp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = temp;
        }
        return String.valueOf(arr);
    }
    public static String toUpperCase(String s){
        char[] arr = s.toCharArray();
        int end = s.lastIndexOf(" ",s.length())+1;
        arr[0] = Character.toUpperCase(arr[0]);
        arr[end] = Character.toUpperCase(arr[end]);
        String str = "";
        for(char c:arr){
            str += c;
        }
        return str;
    }
    public static int count(String str,String target){
        int num = 0;
        int index = 0;
        while(index!=-1){
            index =str.indexOf(target,index+target.length());
//            System.out.println(index);
            num++;
        }
        return num-1;
    }
}
