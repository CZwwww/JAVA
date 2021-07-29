package com.xms.day02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author czw
 * @create 2021-06-15-下午 8:22
 */
public class NewsDemo {
 /*   新闻一：中国多地遭雾霾笼罩空气质量再成热议话题
    新闻二：春节临近北京“卖房热”*/
 public static void main(String[] args) {
     News n1 = new News("中国多地遭雾霾笼罩空气质量再成热议话题");
     News n2 = new News("春节临近北京\"卖房热\"");
     List<News> newsList = new ArrayList<>();
     newsList.add(n1);
     newsList.add(n2);


     ListIterator<News> lit =
             newsList.listIterator(newsList.size());
     while(lit.hasPrevious()){
         News news = lit.previous();
         if(news.getTitle().length()>14) {
             StringBuilder sb = new StringBuilder(news.getTitle());
             sb.replace(14, sb.length(), "…");
             news.setTitle(sb.toString());
         }
         System.out.println(news);

     }
 }
}
