package com.xms.day01;

/**
 * @author czw
 * @create 2021-06-22-下午 2:41
 */
public enum seasonEnum implements Inter{
    SPRING("春天","春暖花开"){
        @Override
        public void showInfo() {
            System.out.println("春天来了");
        }
    },
    SUMMER("夏天","烈日炎炎"){
        @Override
        public void showInfo() {
            System.out.println("夏天来了");
        }
    },
    AUTUMN("秋天","落英缤纷"){
        @Override
        public void showInfo() {
            System.out.println("秋天来了");
        }
    },
    WINTER("冬天","白雪皑皑"){
        @Override
        public void showInfo() {
            System.out.println("冬天来了");
        }
    },


    ;
    private final String SEASON_NAME;
    private final String SEASON_DESC;

    private seasonEnum(String SEASON_NAME, String SEASON_DESC) {
        this.SEASON_NAME = SEASON_NAME;
        this.SEASON_DESC = SEASON_DESC;
    }

    public String getSEASON_NAME() {
        return SEASON_NAME;
    }

    public String getSEASON_DESC() {
        return SEASON_DESC;
    }

    @Override
    public String toString() {
        return "seasonEnum{" +
                "SEASON_NAME='" + SEASON_NAME + '\'' +
                ", SEASON_DESC='" + SEASON_DESC + '\'' +
                '}';
    }

    //實現方式1
//    @Override
//    public void showInfo() {
//        switch(this){
//            case SPRING:
//                System.out.println(SPRING.getSEASON_DESC());
//                break;
//            case AUTUMN:
//                System.out.println(AUTUMN.getSEASON_DESC());
//                break;
//        }
//
//    }
}
