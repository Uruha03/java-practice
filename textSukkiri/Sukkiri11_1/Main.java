package textSukkiri.Sukkiri11_1;

public class Main {
    public static void main(String args[]){
        Book b = new Book("スッキリ", 1600, "red", "isbn880088");
        Computer c = new Computer("Windows11", 140000, "white", "hujita");

        System.out.println("本の名前：" + b.name);
        System.out.println("本の値段：" + b.price);
        System.out.println("本の色：" + b.color);
        System.out.println("本のISBN：" + b.isbn);
        // Computerクラス
        System.out.println("コンピューターの名前：" + c.name);
        System.out.println("コンピューターの値段：" + c.price);
        System.out.println("コンピューターの色：" + c.color);
        System.out.println("コンピューターのメーカー名：" + c.makerName);
    }
}
