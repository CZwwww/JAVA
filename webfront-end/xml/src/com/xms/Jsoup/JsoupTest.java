package com.xms.Jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import com.sun.media.sound.SoftTuning;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author czw
 * @create 2021-07-23-下午 2:24
 */
public class JsoupTest {
    @Test
    public void test() throws IOException {
        Document parse = Jsoup.parse(new File("src\\com\\xms\\Jsoup\\student"),"UTF-8");
//        System.out.println(parse);
        Elements elements = parse.getElementsByAttributeValue("number", "no1");
//        System.out.println(elements);
        Element element = elements.get(0);
        Elements names = element.getElementsByTag("name");
        Element name = names.get(0);
        System.out.println(name.text());
    }
    @Test
    public void test02() throws IOException, XpathSyntaxErrorException {
        Document parse = Jsoup.parse(new File("src\\com\\xms\\Jsoup\\student"),"utf-8");
//        Elements names = parse.select("name");
//        names.forEach(System.out::println);
//        Elements student = parse.select("student:eq(0 )");
//        System.out.println(student.size());
        JXDocument jxDocument = new JXDocument(parse);
//        List<JXNode> jxNodes = jxDocument.selN("//student");
//        jxNodes.forEach(System.out::println);
        List<JXNode> jxNodes1 = jxDocument.selN("//student/name[@id]");
        jxNodes1.forEach(System.out::println);

    }
}
