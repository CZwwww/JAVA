package com.xms.day01;

/**
 * @author czw
 * @create 2021-06-22-下午 2:16
 */
public class Season {
    private final String SEASON_NAME;
    private final String SEASON_DESC;
    private Season(String season_name, String season_desc){
        SEASON_NAME = season_name;
        SEASON_DESC = season_desc;
    }


    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","烈日炎炎");
    public static final Season AUTUMN = new Season("秋天","落英缤纷");
    public static final Season WINTER = new Season("冬天","白雪皑皑");


}
