package practiceEx;

// マークと数字を持つクラス
abstract class Card {
    String mark;
    String cardNumber;

    protected Card(String listMark, String listCardNumber) {
        this.mark = listMark;
        this.cardNumber = listCardNumber;
    }
    protected Card(){    }

    // toString()を追加して、printの時に「card」ではなく「card.toString()」を呼んでしまうのを防ぐ
    @Override
    public String toString() {
        return mark + " " + cardNumber;
    }
}

// マークと数字を持つ　CardNumber
class CardNumber extends Card {
    final String[] markList = { "♡heart", "♧clover", "♤spade", "♢diamond"};
    final String[] cardNumberList = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

    public CardNumber(String listMark, String listCardNumber) {
        super(listMark, listCardNumber);
    }
    public CardNumber(){    }
}

// ジョーカーを持つ　CardJoker
class CardJoker extends Card {
    final String[] jokerList = { "joker" };

    public CardJoker(String listMark, String listCardNumber) {
        super(listMark, listCardNumber);
    }
    public CardJoker(){    }
}