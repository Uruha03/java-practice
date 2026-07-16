package practiceEx;

import java.util.ArrayList;
import java.util.Collections;

// Cardクラスのリストを持つクラス
// 山札のイメージ
public class Trump {
    String[] markList = { "♡heart", "♧clover", "♤spade", "♢diamond"};
    String[] cardNumberList = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Joker" };
    ArrayList<Card> deck = new ArrayList<>();
    Card card = new Card();

    // ジョーカーを除いた52枚のCard（＝山札）を生成し、保持する
    public Trump(){
        for ( int i = 0; i < markList.length; i++ ){
            for ( int j = 0; j < cardNumberList.length-1; j++ ){
                deck.add(new Card(markList[i], cardNumberList[j]));
            }
        }
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
    public void distribute(Player p1, Player p2, Player p3 ) {
        int pNum = 1;
        while( !deck.isEmpty() ){
            switch ( pNum ) {
                case 1:
                    p1.handCard.add(deck.remove(0));
                    break;
                case 2:
                    p2.handCard.add(deck.remove(0));
                    break;
                case 3:
                    p3.handCard.add(deck.remove(0));
                    break;
            }

            pNum++;
            if( pNum > 3 ) {
                pNum = 1;
            }
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
