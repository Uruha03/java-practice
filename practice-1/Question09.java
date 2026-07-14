public class Question09 {
    public static void main(String[] args) {
        int a = 31;
        boolean[] prime = new boolean[a];

        // 全てtrueにしておく
        // 0と1は素数ではないので、最初からfalseで省いておく
        for (int i = 2; i < prime.length; i++) {
            prime[i] = true;
        }

        // 篩にかける倍数
        for ( int i = 2; i < prime.length; i++ ){
            // 篩にかける値を計算し、合致すればfalse
            for ( int j = 2; i * j < prime.length; j++ ){
                int notPrime = i * j;
                prime[notPrime] = false;
            }
        }
        // 表示
        for ( int x = 1; x < prime.length; x++ ){
            System.out.println(x + ":" + prime[x] );
        }
    }
}
