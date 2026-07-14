package practice02;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 2-1. インスタンス化
        // 同じパッケージ内ならimportしなくても良い
        Dryer d = new Dryer();
        AirConditioner a = new AirConditioner();

        // 2-4. インスタンス化したクラスを任意のキーを持つMapに格納する
        // (DryerもAirConditionerも、Dryableで実装しているため、Dryable型に統一できる)
        Map<Integer, Dryable> machine = new HashMap<>();
        machine.put(1, new Dryer());
        machine.put(2, new AirConditioner());
        // 2-4. キーに応じたクラスのdryメソッドを呼び出す
        machine.get(1).dry();
        machine.get(2).dry();
    }
}
