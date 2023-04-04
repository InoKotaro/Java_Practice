public class Lesson3Car {
  //===メンバ変数===
  int no;
  int speed;

  //===属性===
  void setNo(int n){ //mainクラスから受け取る引数が何型か&変数名を定義しておく
    no = n; //no変数に引数nの値を代入(このクラス内で使えるようにする)
  }

  void run(int s){
    speed = s; //speed変数に引数sの値を代入
  }

  void stop(){
    speed = 0; //stopメソッド呼び出しでspeedは0になる
  }

  void display(){
    System.out.println("ナンバー" + no + "の速度は" + speed + "です");
  }
}
