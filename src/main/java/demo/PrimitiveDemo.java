package demo;

import static java.lang.System.lineSeparator;

public class PrimitiveDemo {
    public static void main(String[] args) {
        //region целочисленные
        byte b = 1;
        short s = 2;
        int i = 4;
        long l = 8;
        //endregion

        //region с плавающей точкой
        float а = 32; // bit
        double d = 64; // bit
        //endregion

        //region символьный
        char c = 'q';
        //endregion

        //region logic
        boolean boo;
        //endregion

        //region wrappers
        System.out.println(Byte.MIN_VALUE + lineSeparator() + Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + lineSeparator() + Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + lineSeparator() + Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + lineSeparator() + Long.MAX_VALUE);
        System.out.println("--- --- ---");
        System.out.println(Float.MIN_VALUE + lineSeparator() + Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE + lineSeparator() + Double.MAX_VALUE);
        System.out.println("--- --- ---");
        //endregion

        isTrue();
    }
    public static void isTrue(){
        int iii = 0;
        while(true){
            iii++;
            if (iii < 10) {
                System.out.println(iii);
            } else {
                System.out.println("go home bye");
                break;
            }
        }
    }
}
