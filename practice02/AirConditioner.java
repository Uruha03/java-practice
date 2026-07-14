package practice02;

// 2-1. Mainとは別ファイルにクラスを作成
// 2-3. インタフェースを実装させる
public class AirConditioner implements Dryable {
    // 2-2. 引数なしのメソッドを作成
    public void dry(){
        System.out.println("これはエアコンです。");
    }
}
