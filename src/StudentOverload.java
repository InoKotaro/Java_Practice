public class StudentOverload {
  String name;
  int engScore;
  int mathScore;
  
  void setDate(String n){ //名前だけ代入
    name = n;
  }

  void setDate(String n, int e, int m){ //名前,英語点,数学点代入
    name = n;
    engScore = e;
    mathScore = m;
  }

  void setScore(int e, int m){ //英語点,数学点代入
    engScore = e;
    mathScore = m;
  }

  void display(){
    System.out.println(name + "さん");
    System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
  }
}
