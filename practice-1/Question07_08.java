import java.lang.Math;

public class Question07_08 {
    public static void main(String[] args){
        // 1-7_Math.floorで切り捨てる。"%.3f%n"で３桁まで表示
        double a = 8.2;
        double area = Math.floor( a * a * Math.PI * 1000 ) / 1000;
        System.out.printf("1-7. 答えは、%.3f%n", area);

        // 1-8_intだとオーバーフローする。
        long x = 2000000000L;
        long y = 1000000000L;
        System.out.println(x + y);
    }
}
