public class Question01_03 {
    public static void main(String[] args){
        int a = 8;
        int b = 5;

        // 1-1~1-3
        System.out.println("1-1. 足し算すると：" + ( a + b ) );
        System.out.println("1-2. 引き算すると：" + ( a - b ) );
        System.out.println("1-3. 掛け算すると：" + ( a * b ) );

        // 1-6
        System.out.println("1-6. 九九表を出力します");
        for ( int i = 1; i <= 9; i++ ){
            for ( int j = 1; j <= 9; j++ ){
                if ( j == 9 ){
                    System.out.println( i * j );
                } else {
                    System.out.print( i * j + " ");
                }
            }
        }


    }
}