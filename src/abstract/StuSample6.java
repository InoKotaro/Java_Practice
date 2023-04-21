//============抽象クラス==================
public class StuSample6 {
  public static void main(String[] args) throws Exception {
    //============抽象クラス==================
    //抽象メソッドがクラス内に一つでもあれば抽象クラスとして扱う
    //各クラス毎に、同じメソッド名で違う処理をさせたいときに有効
    //抽象メソッドのメリット：①抽象クラスを継承する仕組みなため、継承後クラスに書くメソッドの名前、処理を統一して書けミス防止になる
                        //②呼び出す側のクラス(今回はStudent6)の書き方も統一できる。「baseballクラス」が増えても「Student6」は書き換える必要なし
    //抽象概念とポリモフィズム(多態性)はセット概念
    //======================================

    TandF taf = new TandF("陸上競技");
    Football fb = new Football("サッカー");

    Student6 stu1 = new Student6("山本", taf); //引数に抽象クラスに繋がっているクラスのオブジェクトが入ってる変数名を書くと、そのクラス内処理が実行される
    stu1.display();
    stu1.practice();

    Student6 stu2 = new Student6("野口", fb);
    stu2.display();
    stu2.practice();
  }
}
