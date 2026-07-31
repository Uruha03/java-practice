package textSukkiri.Sukkiri11_4;

// 教科書からコードを見つけられなかったため、一から記述
// 有形資産と無形資産のどちらからも継承されるクラス
public class Assets {
	private String name;
    
	//コンストラクタ
    // スーパーコンストラクタがないとサブクラスでエラーが出る（Implicit super constructor is undefined.）
	public Assets(String name) {
		this.name = name;
    }

	//ゲッタ
	public String getName() { return this.name; }
    
}
