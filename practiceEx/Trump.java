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
        deck.add(new CardJoker("", "Joker"));
        deck.add(new CardJoker("", "Joker"));
    }

    // 保持しているCardを混ぜるshuffleメソッド
    public ArrayList<Card> shuffle() {
        // リストにランダム格納することでシャッフルとする
        Collections.shuffle(deck);
        System.out.println("カードをシャッフルしました");
        return deck;
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
        for ( Card printCard : deck ){
            System.out.println(printCard);
        }
        System.out.println("山札のカードをすべて見せました");
    }
}
