public class Student {
  //メンバ変数(属性) クラス名の直下に書く(最初に箱を用意)
  //ここで書くメンバ変数は当該クラス内でしか適用不可
  String name;
  int engScore;
  int mathScore;

  //============メソッド(操作)書き方==================
  //引数はメソッドに値を渡す時に書く。戻り値は計算結果の値をさす。
  //戻り値がない時は型をvoidにする。あるときあは文末にreturnを書く
  //引数がなくても「()」は書く
  //※引数はmainメソッド経由で渡す
  //===============================================

  //メソッド(操作)
  void display(){
    System.out.println(name + "さん");
    System.out.println("英語" + engScore + "点, 数学" + mathScore + "点"); 
  }

  void setScore(int eng, int math){ //引数を変数へ代入
    engScore = eng;
    mathScore = math;
  }

  double getAvg(){
    double avg = (engScore + mathScore) / 2.0; //「2.0」で書くことでdouble型で返る。「2」ではint型になる
    return avg;
  }

}
