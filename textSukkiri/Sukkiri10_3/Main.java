package textSukkiri.Sukkiri10_3;

public class Main {
    public static void main(String args[]){
        // 敵と勇者を生成する
        PoisonMatango pm = new PoisonMatango();
        Hero h = new Hero();

        // 勇者の初期値を設定する
        h.name = "みなと";
        h.hp = 100;
        // 敵の攻撃
        pm.attack(h);
        pm.attack(h);
        pm.attack(h);
        pm.attack(h);
        pm.attack(h);
        pm.attack(h);
    }
}
