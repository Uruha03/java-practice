package textSukkiri.Sukkiri10_3;

public class Matango {
	int hp = 50;
	char suffix;
	Hero h = new Hero();

	// デフォルトコンストラクタ
	public Matango() { }

	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public int attack(Hero h) {
		int damage = 10;
		System.out.println("きのこ" + this.suffix + "の攻撃");
		System.out.println(damage + "ダメージ");
		return damage;
	}
}