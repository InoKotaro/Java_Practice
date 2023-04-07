public class Car2 { //ここのクラス名はファイル名と一致させる(大文字で)
  int no;
  int speed;

  //以下２つCar2メソッドがコンストラクタ
  Car2(){ //コンストラクタ設定。引数なし時はナンバーを0にする
    no = 0;
  }

  Car2(int n){ //コンストラクタ設定。引数ある時はナンバーを指定できる
    no = n;
  }

  void run(int s){
    speed = s;
  }

  void brake(){
    speed = 0;
  }

  void brake(int s){
    speed = speed - s;
  }

  void display(){
    System.out.println("ナンバー" + no +"の速度は" + speed + "です");
  }
}
