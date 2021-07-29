package com.xms.template;

import org.junit.Test;

/**
 * @author czw
 * @create 2021-06-23-上午 11:32
 */
public class TemplateTest {
    @Test
    public void test(){
        GetTime g = new GetTime();
        g.geTime(() -> {
            String str = "";
            for(int i = 0;i<10000;i++){

                str+=i;
            }
        });
        g.geTime(() -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0;i<10000;i++){
                sb.append(i);
            }
        });
    }
}
