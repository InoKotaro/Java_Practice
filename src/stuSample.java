public class stuSample {
  public static void main(String[] args) throws Exception {
    //============オブジェクト指向で書くには==================
    //実行用クラスと設計図クラスが必要
    //実行用クラス: mainメソッドを記述
    //設計図クラス: 属性(変数)と操作(メソッド)を記述
    //コンパイルは「mainメソッド」があるファイルで実行すると連携してるファイルも自動でコンパイルされる
    //====================================================
    Student stu1 = new Student(); //ここでnewしてオブジェクトをインスタンス化(具現化)。使いたいクラス名は一致両辺一致させる

    stu1.name = "弓木"; //「インスタンス化した変数.メソッド」に値を引数で渡す
    stu1.setScore(70, 90);

    stu1.display();
    System.out.println("平均" + stu1.getAvg() + "点");
  }
}
