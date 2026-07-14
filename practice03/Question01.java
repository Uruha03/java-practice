package practice03;

public class Question01 {
    public static void main(String[] args) {
        try {
            int num = 3 / 0;
        } catch ( ArithmeticException e ){
            System.out.println("例外が発生しました。");
            System.out.println(e);
        }
    }
}
