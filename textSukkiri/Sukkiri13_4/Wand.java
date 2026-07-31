package textSukkiri.Sukkiri13_4;

public class Wand {
	private String name;
	private double power;

	// ゲッタ
	public String getName() { return name; }
	public double getPower() { return power; }
	// セッタ
	public void setName(String name) throws IllegalArgumentException {
		// ①杖の名前は必ず３文字以上を指定する必要がある
		if(name.length() < 3){
	   		throw new IllegalArgumentException("杖の名前は必ず３文字以上を指定してください");
		}
		this.name = name;
	}

	public void setPower(double power) throws IllegalArgumentException {
		// ②杖による増幅率は、0.5以上100以下にする
		double low = 0.5;
		double high = 100;
		if(power < low|| power > high){
	   		throw new IllegalArgumentException("杖による増幅率は、0.5以上100以下にしてください");
		}
		this.power = power;
	}
}
