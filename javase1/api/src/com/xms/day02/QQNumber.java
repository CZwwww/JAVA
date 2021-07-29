package com.xms.day02;

/**
 * @author czw
 * @create 2021-06-09-下午 5:53
 */
public class QQNumber {
    public static void main(String[] args) {
//        String regex = "[1-9]\\d{4,9}";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("QQ:");
//        String qqNumber = sc.next();
//        System.out.println(qqNumber.matches(regex));
        String str = "ac2bed423sad1244aw";
        String regex = "\\d+";
        String str1 = str.replaceAll(regex,"\\$");
        System.out.println(str1);

    }
}
