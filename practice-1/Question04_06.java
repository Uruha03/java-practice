public class Question04_06 {
    public static void main(String[] args){
        // 1-4~1-5
        int[][] array = {
            { 10, 20 },             
            { 40, 50 },
            { 70, 80 },
        };
        for ( int i = 0; i <= 2; i++ ){
            System.out.println("1-4. " + ( i + 1 ) + "つめの計算結果は、" + ( array[i][0] + array[i][1]) );
        }
        for ( int[] row : array ){
            System.out.println("1-5. " + row[0] + "と" + row[1] + "の計算結果は、" + ( row[0] + row[1] ) );
            // rowは、{10, 20}を持っている
        }
        
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