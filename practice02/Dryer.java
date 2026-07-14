package practice02;

// 2-1. Mainとは別ファイルにクラスを作成
// 2-3. インタフェースを実装させる
public class Dryer implements Dryable {
    // 2-2. 引数なしのメソッドを作成
    public void dry(){
        int power = 3;
        if ( power < 2 ) {
            System.out.println("このドライヤーは、強くありません。");
        }
        if ( power < 4 ) {
            System.out.println("このドライヤーは、普通の強さです。");
        } else {
            System.out.println("このドライヤーは、強いです！");
        }
    }

}
