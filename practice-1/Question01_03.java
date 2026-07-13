public class Question01_03 {
    public static void main(String[] args){
        int a = 8;
        int b = 5;

        // 1-1~1-3
        System.out.println("1-1. 足し算：" + ( a + b ) + "　　引き算すると：" + ( a - b ) + "　　掛け算すると：" + ( a * b ));
        System.out.println("1-2. 割り算（小数点）：" + (double) a / b );
        System.out.println("1-3. 割り算（余り）：" + a % b );
    }
}