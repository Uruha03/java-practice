package textSukkiri.Sukkiri11_1;

public class Computer extends TangibleAsset { 
	String makerName;
	
	//コンストラクタ
	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
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
	public String getmakerName() { return this.makerName; }
}
