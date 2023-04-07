public class Car1 { //ここのクラス名はファイル名と一致させる(大文字で)
  int no;
  int speed;

  void setNo(int n){
    no = n;
  }

  void run(int s){
    speed = s;
  }

  //以下２つbrakeメソッドがオーバーロード
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
