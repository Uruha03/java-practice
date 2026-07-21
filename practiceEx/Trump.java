package practiceEx;

import java.util.ArrayList;
import java.util.Collections;

// Cardクラスのリストを持つクラス
// 山札のイメージ
public class Trump {
    ArrayList<Card> deck = new ArrayList<>();
    CardNumber cardNumber = new CardNumber();
    CardJoker cardJoker = new CardJoker();

    // ジョーカーを除いた52枚のCard（＝山札）を生成し、保持する
    public Trump(){
        for ( String mark : cardNumber.markList ){
            for ( String num : cardNumber.cardNumberList ){
                deck.add(new CardNumber(mark, num));
            }
        }
        // 同じ処理はforで書く
        for( int i = 0; i < 2; i++ ) {
            deck.add(new CardJoker("", "Joker"));
        }
    }

    // 保持しているCardを混ぜるshuffleメソッド
    // Mainクラスでインスタンスを生成していて、シャッフル後のdeckフィールドに直接アクセスできる
    // shuffle()内で新しいArrayListを作って返す場合は、新しいArrayListをメソッドの外でも使えるようにreturnが必要
    public void shuffle() {
        // リストにランダム格納することでシャッフルとする
        Collections.shuffle(deck);
        System.out.println("カードをシャッフルしました");
    }

    // 引数の各Playerに1枚ずつ全てのCardを配るdistributeメソッド
    // Playerの手札が更新されるので、戻り値は必要ない
    public void distribute( ArrayList<Player> players ) {
        int pNum = 1;
        while( !deck.isEmpty() ){
            switch ( pNum % 3 ) {
                case 1:
                    players.get(0).handCard.add(deck.remove(0));
                    break;
                case 2:
                    players.get(1).handCard.add(deck.remove(0));
                    break;
                case 0:
                    players.get(2).handCard.add(deck.remove(0));
                    break;
            }
            pNum++;
        }
        System.out.println("カードを配り終えました");
    }

    // 引数のCardをリストに戻すturnBackメソッド
    public void turnBack(ArrayList<Card> returnCard) {
        for ( Card oneCard : returnCard ){
            deck.add(oneCard);
        }
        returnCard.clear();
        System.out.println("すべての手札カードを山札に戻しました");
    }

    // 保持しているカードを出力するprintメソッド
    public void print() {
        System.out.println(deck);
        System.out.println("山札のカードをすべて見せました");
    }
}
