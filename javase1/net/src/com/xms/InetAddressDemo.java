package com.xms;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author czw
 * @create 2021-06-24-下午 2:26
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("EKJ8CH45ZSOJSCI");
        System.out.println(address);
        InetAddress address1 = InetAddress.getByName("169.254.130.137");
        System.out.println(address.equals(address1));
        System.out.println(address==address1);
        System.out.println(address1.getHostAddress());
        System.out.println(address1.getHostName());

    }
}
