package textSukkiri.Sukkiri11_4;

// TangibleAssetは、Assetsを継承していてかつThingインタフェースを実装している
public class TangibleAsset extends Assets implements Thing{
	private int price;
	private String color;
	double weight;

	//コンストラクタ
    // スーパーコンストラクタがないとサブクラスでエラーが出る（Implicit super constructor is undefined.）
	public TangibleAsset(String name, int price, String color) {
		super(name);
		this.price = price;
		this.color = color;
    }

	//ゲッタ
	public int getPrice() { return this.price; }
	public String getColor() { return this.color; }

	// Thingインタフェースのゲッタとセッタ
    public double getWeight(){
		return weight;
	}
    public void setWeight(double weight){
		this.weight = weight;
	}
}
