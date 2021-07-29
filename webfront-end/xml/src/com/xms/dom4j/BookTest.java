package com.xms.dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

/**
 * @author czw
 * @create 2021-07-23-上午 11:52
 */
public class BookTest {
    @Test
    public void test() throws DocumentException {
        SAXReader reader = new SAXReader();
        //获取DOM树
        Document doct = reader.read("src/com/xms/dom4j/book.xml");
        Element rootElement = doct.getRootElement();
        List<Element> elements = rootElement.elements();
        elements.forEach(e->{
            String sn = e.attribute("sn").getValue();
            String name = e.element("name").getText();
            double price = Double.parseDouble(e.elementText("price"));
            String[] author = {e.elementText("author")};
            Book b = new Book(sn,name,price,author);
            System.out.println(b);

        });

    }
}
