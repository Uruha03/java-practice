package practiceEx;

public class Main {
    public static void main(String[] args) {
        // インスタンス生成
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Trump trump = new Trump();

        // 3人のPlayerにシャッフルしたCardを配る
        trump.shuffle();
        trump.distribute(p1, p2, p3);
        // それぞれのCardを出力する
        p1.print();
        p2.print();
        p3.print();
        // 2人のPlayerはTrumpに返却しTrumpが保持するCardを表示させてください。
        p1.repayment(trump);
        p2.repayment(trump);
        trump.print();
        System.out.println("山札 : " + trump.deck.size());
        System.out.println("P1 : " + p1.handCard.size());
        System.out.println("P2 : " + p2.handCard.size());
        System.out.println("P3 : " + p3.handCard.size());
    }
}
