package textSukkiri.Sukkiri13_4;

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
	public void setName(String name) throws IllegalArgumentException {
		// ①魔法使いの名前は必ず３文字以上を指定する必要がある
		if(name.length() < 3){
	   		throw new IllegalArgumentException("魔法使いの名前は必ず３文字以上を指定してください");
		}
		this.name = name;
	 }
	public void setMp(int mp)throws IllegalArgumentException {
		// ④魔法使いのHPとMPは0以上である
		if(mp < 0){
	   		throw new IllegalArgumentException("魔法使いのMPは0以上にしてください");
		}
		this.mp = mp;
	}
	public void setHp(int hp) {
		// ④魔法使いのHPとMPは0以上である。ただし、HPに負の値を設定しようとした場合は0が設定される。
		if(hp < 0){
			this.hp = 0;
		}else{
			this.hp = hp;
		}
	}
	public void setWand (Wand wand)throws IllegalArgumentException {
		// ③魔法使いは必ず杖を装備する。
		if(wand == null){
	   		throw new IllegalArgumentException("魔法使いは必ず杖を装備してください");
		}
		this.wand = wand;
	}
}

