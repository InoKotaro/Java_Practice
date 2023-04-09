//============カプセル化(stuSample5)============
public class StudentCapsule {
  private String name; //private指定
  private int score; //private指定することで他クラスからscore変数の中身を書き換え不可にできる(メソッド経由でメンバ変数に代入させたい際に発揮)

  public StudentCapsule(String n){ //[おさらい](コンストラクタ時)クラス名と一致させる&戻り値を書かない(voidとかintとかの型)
    name = n;
  }

  public void setScore(int s){ //[おさらい]メソッドに戻り値がない時は型をvoidにする。あるときあは文末にreturnを書く
    if(0 <= s && s <= 100){ //入力可能値判別(0〜100点)
      score = s;
    }else{
      System.out.println(name + "さんの点数が範囲外です");
      score = 0;
    }
  }

  void display(){
    System.out.println(name + "さん: " + score + "点");
  }
}
