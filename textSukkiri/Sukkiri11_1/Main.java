package textSukkiri.Sukkiri11_1;

public class Main {
    public static void main(String args[]){
        Book b = new Book("スッキリ", 1600, "red", "isbn880088");
        Computer c = new Computer("Windows11", 140000, "white", "hujita");

        // ゲッタを使用してカプセル化を維持しながら呼び出し
        // Bookクラス
        System.out.println("本の名前：" + b.getName());
        System.out.println("本の値段：" + b.getPrice());
        System.out.println("本の色：" + b.getColor());
        System.out.println("本のISBN：" + b.getIsbn());
        // Computerクラス
        System.out.println("コンピューターの名前：" + c.getName());
        System.out.println("コンピューターの値段：" + c.getPrice());
        System.out.println("コンピューターの色：" + c.getColor());
        System.out.println("コンピューターのメーカー名：" + c.getmakerName());
    }
}
