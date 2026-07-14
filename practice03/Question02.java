package practice03;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        // 選択肢を表示し、選んでもらう
        System.out.println("1.ブラジル産  2.コロンビア産  3.グアテマラ産  4.オリジナルブレンド");
        Scanner in = new Scanner(System.in);
        System.out.println("豆の産地を数字で選択してください");
        int choice = in.nextInt();
        in.close();

        // メソッドを呼び出して、発生した例外をキャッチする
        try {
            // メソッドでtrhowsしたエラー型と同じcatchがないとエラーが出る
            String result = coffee(choice);
            System.out.println(result + "のコーヒーを淹れました！");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("例外が発生しました");
            System.out.println(e);
        }
    }

    // 任意のメソッドを作成
    // IOException意外にも、発生すると思われるエラー型は選択できる
    public static String coffee(int type) throws IndexOutOfBoundsException {
        // 配列
        String[] area = { "ブラジル産", "コロンビア産", "グアテマラ産", "オリジナルブレンド", " "};
        return area[type - 1];
    }

    // コーヒー豆の種類をintで渡してcoffeeメソッドを呼ぶ
    // 配列から探してみる
    // エラー：配列インデックス番号がオーバー
    // エラー：引数がnull
}
