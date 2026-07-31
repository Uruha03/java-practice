package textSukkiri.Sukkiri13_1;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero h) {
		int basePoint = 10; //基本回復ポイント
		int recovPoint = (int)(basePoint * wand.getPower()); //杖による増幅
		h.setHp(h.getHp() + recovPoint);
		System.out.println( h.getName() + "のHPを" + recovPoint + "回復した！");
	}

	// ゲッタ
	public String getName() { return name; }
	public int getMp() { return mp; }
	public int getHp() { return hp; }
	public Wand getWand() { return wand; }
	// セッタ
	public void setName(String name) { this.name = name; }
	public void setMp(int mp) { this.mp = mp; }
	public void setHp(int hp) { this.hp = hp; }
	public void setWand (Wand wand) { this.wand = wand; }
}

