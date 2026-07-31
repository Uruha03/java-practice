package textSukkiri.Sukkiri11_4;

public class Computer extends TangibleAsset { 
	private String makerName;
	
	//コンストラクタ
	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}

	//ゲッタ
    // 親クラスで定義したゲッタは、振る舞いが変わらなければオーバーライド不要
	public String getmakerName() { return this.makerName; }
}
