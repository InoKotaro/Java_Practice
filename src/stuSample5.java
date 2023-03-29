//============カプセル化==================
public class stuSample5 {
  public static void main(String[] args) throws Exception {
    //============カプセル化==================
    //メンバ変数、メソッドに「private」「protected」(次章で)「public」を書くことでクラス間でメンバ変数の値を書き換え制限を指定可能になる
    //メンバ変数は基本的「private」指定して他クラスから直接値を書き換え制限をかける。メソッド経由で(if文などを使い)値を代入しないと意図しない値とかになるリスクがある。
    //上記は複数人での開発でミス抑制になる
    //カプセル化のメリット：①メソッド経由にさせるため不正な値代入を阻止できる、②メンバ変数修正時に「private指定」しているので当該クラス内だけで済む
    //====================================
    StudentCapsule stu1 = new StudentCapsule("諸橋");
    stu1.setScore(90);
    stu1.display();

    StudentCapsule stu2 = new StudentCapsule("佐々木");
    stu2.setScore(-50);
    //stu2.score = -50; //実行用クラスでメンバ変数にprivate指定しているのでコンパイルエラーになる
    stu2.display();
  }
}
