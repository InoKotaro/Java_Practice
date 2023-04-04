//============コンストラクタ(stuSample3)==================
public class StudentConstruct {
  String name;
  int engScore;
  int mathScore;

  StudentConstruct(String n){ //クラス名と一致させる&戻り値を書かない(voidとかintとかの型)
    name = n;
  }

  StudentConstruct(String n, int e, int m){
    name = n;
    engScore = e;
    mathScore = m;
  }

  void setScore(int e, int m){
    engScore = e;
    mathScore = m;
  }

  void display(){
    System.out.println(name + "さん");
    System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
  }
}
