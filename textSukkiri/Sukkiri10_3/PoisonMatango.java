package textSukkiri.Sukkiri10_3;

// import Math;

public class PoisonMatango extends Matango {
	int poison = 5;

    // オーバーライドするためには、メソッド名と引数が一致していてfinalやstaticメソッドではない必要がある
    @Override
	public void attack(Hero h) {
		super.attack(h);
    	if( 0 < poison ){
	    	System.out.println("さらに毒の胞子をばら撒いた！");
            // 割っているのでダメージが0にならないように切り上げる
		    System.out.println((int)(Math.ceil(h.hp/5)) + "ポイントのダメージ！");
            h.hp -= h.hp/5;
	        poison = poison - 1;
        }
        System.out.println(h.hp);
	}

}
