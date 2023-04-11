//============オーバーロード==================
public class stuSample2 {
  public static void main(String[] args) throws Exception {
    //============オーバーロード==================
    //[おさらい]初期化は宣言と代入を一緒に行うこと(今回はnewでオブジェクト生成部分)
    //同じメソッド名でも引数の数で使用するメソッドを判断してくれる
    //==========================================

    StudentOverload stu1 = new StudentOverload(); //ここで宣言と代入を一緒にして初期化も可能
    StudentOverload stu2 = new StudentOverload();

    //=======stu1オブジェクトのはなし=======
    //①上から読まれるため設計クラス内のsetDateメソッドで引数の数を判別して、String型が一つパターンのsetDateメソッドと一致する
    //②引数の数が3つあるので3つあるパターンのsetDateメソッドは適用範囲外になる
    //③setDateメソッドとsetScoreメソッドが別々に適用される
    stu1.setDate("佐々木");
    stu1.setScore(70,100);
    stu1.display();

    //=======stu2オブジェクトのはなし=======
    //引数の数が3つあるので3つあるパターンのsetDateメソッドが適用される
    stu2.setDate("髙松", 90, 100); //この1行下にsetScoreメソッドで点数指定すると上書きされる
    stu2.display();
  }
}
