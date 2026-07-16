package practiceEx;

import java.util.ArrayList;

// プレイヤーの手札を持つ
public class Player {
    // 手札
    ArrayList<Card> handCard = new ArrayList<>();

    // 自身の手持ちのCardを出力するprintメソッド
    public void print(){
        for ( Card printCard : handCard ){
            System.out.println(printCard);
        }
        System.out.println("手札カードをすべて見せました");
    }
    // 手持ちのCardをTrumpに返却するrepaymentメソッド
    // PlayerクラスでTrumpインスタンス生成するとTrumpが２組できるからダメ
    public void repayment(Trump trump){
        trump.turnBack(handCard);
        System.out.println("手札カードを返却しました");
    }
}
