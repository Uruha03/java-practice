package textSukkiri.Sukkiri10_3;

public class PoisonMatango extends Matango {
	int poison = 5;

    // 「お化け毒キノコ A」のAがsuffixになる
	public PoisonMatango(char suffix) {
		this.suffix = suffix;
	}

    // オーバーライドするためには、メソッド名と引数が一致していてfinalやstaticメソッドではない必要がある
    @Override
	public int attack(Hero h){
        int hp = h.hp;
		int damage = super.attack(h);
		int poisonDamage = 0;
    	if( 0 < poison ){
            poisonDamage = Math.ceilDiv(hp, 5);
	    	System.out.println("さらに毒の胞子をばら撒いた！");
            // 割っているのでダメージが0にならないように切り上げる
            // 「(int)(Math.ceil(h.hp/5))」は(h.hp/5)がint型で結果を出すため、Math.ceilの意味がない
            // 「Math.ceilDiv(h.hp, 5)」は、int型の引数を2つ受け取り、第一引数を第二引数で割った値を切り上げてint型で返す
		    System.out.println(poisonDamage + "ポイントのダメージ！");
	        poison = --poison;
        }
		return damage + poisonDamage;
	}

}
