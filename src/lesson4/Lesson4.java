public class Lesson4 {
  public static void main(String[] args) throws Exception {
    //=======問題1(Car1使用パターン)========
    // Car1 c1 = new Car1();

    // c1.setNo(1234);
    // c1.run(30);
    // c1.display();
    // c1.brake(10);
    // c1.display();

    //=======問題2(Car2使用パターン)コンストラクタ理解確認問題========
    //設計図クラス側でコンストラクタを定義していることで初期化と同時に引数渡せる
    Car2 c1 = new Car2();

    c1.run(30);
    c1.display();

    Car2 c2 = new Car2(1234); //設計図クラス側でコンストラクタ使用旨を設定してないとコンパイルエラーになる

    c2.run(90);
    c2.display();
  }
}
