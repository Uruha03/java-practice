package textSukkiri.Sukkiri11_1;

public class Book extends TangibleAsset {
	String isbn;

	//コンストラクタ
	public Book(String name, int price, String color, String isbn) {
        super(name, price, color);
		this.isbn = isbn;
	}

	//メソッド
    public String getName(){
        return super.getName();
    }
    public int getPrice(){
        return super.getPrice();
    }
    public String getColor(){
        return super.getColor();
    }
	public String getIsbn() { return this.isbn; }
}
