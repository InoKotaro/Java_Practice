public class Lesson4 {
  public static void main(String[] args) throws Exception {
    //=======問題1(Car1使用パターン)オーバーロード理解確認問題========
    // Car1 c1 = new Car1();

    // c1.setNo(1234);
    // c1.run(30);
    // c1.display();
    // c1.brake(10);
    // c1.display();

    //=======問題2(Car2使用パターン)コンストラクタ理解確認問題========
    //設計図クラス側でコンストラクタを定義していることで初期化と同時に引数渡せる
    // Car2 c1 = new Car2();

    // c1.run(30);
    // c1.display();

    // Car2 c2 = new Car2(1234); //設計図クラス側でコンストラクタ使用旨を設定してないとコンパイルエラーになる

    // c2.run(90);
    // c2.display();

    //=======問題3(Car3使用パターン)カプセル化(アクセス修飾子)理解確認問題========
    // Car3 c1 = new Car3();

    // c1.run(30);
    // c1.display();

    // Car3 c2 = new Car3(1234); //設計図クラス側でコンストラクタ使用旨を設定してないとコンパイルエラーになる

    // //c2.speed = 50; //実行用ファイルでspeedメンバ変数はprivateでカプセル化されている為、外部ファイルから書き換え不可(コンパイルエラーになる。メソッド経由であれば可能)
    // c2.run(90);
    // c2.display();

    //=======問題4(Car4使用パターン)static理解確認問題========
    Car4 c1 = new Car4();
    //Car4.display(); //設計図クラスでメソッドをstatic化した際は、当該メソッドは「クラス名.メソッド名」で書く

    Car4 c2 = new Car4(1234);
    //Car4.display();

    Car4 c3 = new Car4(5678);
    //Car4.display();

    Car4.display();

  }
}
