package practiceEx;

// マークと数字を持つクラス
public class Card {
    String mark;
    String cardNumber;

    public Card(String listMark, String listCardNumber){
        this.mark = listMark;
        this.cardNumber = listCardNumber;
    }
    public Card(){    }

    // toString()を追加して、printの時に「card」ではなく「card.toString()」を呼んでしまうのを防ぐ
    @Override
    public String toString() {
        return mark + " " + cardNumber;
    }
}
