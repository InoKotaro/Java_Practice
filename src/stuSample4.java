//============static==================
public class stuSample4 {
  public static void main(String[] args) throws Exception {
    //============static==================
    //メンバ変数に「static」を書くことで変数をクラス内で共通して使えるようになる(counter変数とかで全体のオブジェクト数などを把握するときに使える)
    //メソッドでも「static」を書くことでインスタンスしてなくても呼び出せるようになる
    //❗️※1「static化したメソッド」を呼び出すときは、 「当該クラス名.メソッド名」で書く必要がある
    //====================================

    StudentStatic stu1 = new StudentStatic("佐々木"); //コンストラクタでオブジェクト作成
    StudentStatic.display(); //※１

    StudentStatic stu2 = new StudentStatic("髙松");
    StudentStatic.display();

    StudentStatic stu3 = new StudentStatic("大谷");
    StudentStatic.display();
  }
}
