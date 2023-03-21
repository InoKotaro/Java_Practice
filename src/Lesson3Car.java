public class Lesson3Car {
  int no;
  int speed;

  void setNo(int n){
    no = n; //no変数に引数nの値を代入
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
