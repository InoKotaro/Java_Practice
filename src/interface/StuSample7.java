//============interface==================
public class StuSample7 {
  public static void main(String[] args) throws Exception {
    //============interface==================
    //「定数」と「抽象メソッド」のみ定義可能
    //インターフェースを実装したクラスでは、全てのメソッド処理を定義する
    //インターフェースは複数実装可能
    //インターフェースを引き継ぐことを「実装」という

    //❗️継承とインターフェースの差別化イメージは↓
    //継承 => 枝を張る
    //実装 => 着色する(部分的に機能ちょいアレンジ的な)

    //abstract(抽象概念)とごっちゃになるため区別して考える
    //interfaceはあくまでメソッドだけ独立させて作り、必要な部分に付け足すもの
    //=======================================
    Student7 stu = new Student7("Tom"); 
    stu.displayEng();

    Baseball bb = new Baseball(); //Baseballオブジェクト生成
    bb.displayEng();
  }
}
