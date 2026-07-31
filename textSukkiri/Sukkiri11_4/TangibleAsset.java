package textSukkiri.Sukkiri11_4;

public class TangibleAsset {
	private String name;
	private int price;
	private String color;

	//コンストラクタ
    // スーパーコンストラクタがないとサブクラスでエラーが出る（Implicit super constructor is undefined.）
	public TangibleAsset(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
    }

	//ゲッタ
	public String getName() { return this.name; }
	public int getPrice() { return this.price; }
	public String getColor() { return this.color; }
}
