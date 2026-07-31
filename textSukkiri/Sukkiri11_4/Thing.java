package textSukkiri.Sukkiri11_4;

public interface Thing {
    // フィールドは暗黙的にpublic static finalになる
    // メソッドは暗黙的にpublic abstractになる
    public double getWeight();
    public void setWeight(double weight);
}
