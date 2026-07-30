package textSukkiri.Sukkiri11_3;

public interface Thing {
    // フィールドは暗黙的にpublic static finalになる
    double weight = 0.0;

    // メソッドは暗黙的にpublic abstractになる
    public double getWeight();
    public double setWeight(double weight);
}
