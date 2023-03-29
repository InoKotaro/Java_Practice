public class stuSample3 {
  public static void main(String[] args) throws Exception {
    //============コンストラクタ==================
    //[おさらい]初期化は宣言と代入を一緒に行うこと(今回はnewでオブジェクト生成部分)
    //コンストラクタのメリット：オブジェクト生成時にコンストラクタに値を代入可能なためコードが簡略化できて分かり易い
    //コンストラクタもオーバーロード可能。よってこれも引数の数で使用するメソッドを判断してくれる

    //--------------コンストラクタ仕様-------------
    //コンストラクタを設定していない状態で「new StudentConstruct()」と書くと引数なしの「デフォルトコンストラクタ」が生成される
    //コンストラクタを設定していると「デフォルトコンストラクタ」は生成されない仕様(コンパイルエラーになる)なので、引数なしのコンストラクタは呼ばないorで予め値にデフォルト値を手動で設定しておく必要がある
    //==========================================

    StudentConstruct stu1 = new StudentConstruct("佐々木"); //ここで宣言と代入を一緒にして初期化も可能
    StudentConstruct stu2 = new StudentConstruct("髙松", 90, 100);

    //=======stu1オブジェクトのはなし=======
    //①(オブジェクト生成時に名前を渡しているので「stu1」の名前は「佐々木」で確定済み)
    //②StudentConstructのオーバーロードでStringデータ単体パターンが適用された為、ここで点数データを渡す
    stu1.setScore(70, 100);
    stu1.display();

    //=======stu2オブジェクトのはなし=======
    //オブジェクト生成時にオーバーロードで値３つパターンでデータを渡してあるので、出力するだけ
    stu2.display();
  }
}