package textSukkiri.Sukkiri11_4;

public class Book extends TangibleAsset {
	private String isbn;

	//コンストラクタ
	public Book(String name, int price, String color, String isbn) {
        super(name, price, color);
		this.isbn = isbn;
	}

	//ゲッタ
    // 親クラスで定義したゲッタは、振る舞いが変わらなければオーバーライド不要
	public String getIsbn() { return this.isbn; }
}
