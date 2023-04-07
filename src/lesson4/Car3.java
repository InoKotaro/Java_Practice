public class Car3 { //ここのクラス名はファイル名と一致させる(大文字で)
  private int no;
  private int speed;

  public Car3(){ //コンストラクタ設定。引数なし時はナンバーを0にする
    no = 0;
  }

  public Car3(int n){ //コンストラクタ設定。引数ある時はナンバーを指定できる
    no = n;
  }

  public void run(int s){
    speed = s;
  }

  public void brake(){
    speed = 0;
  }

  public void brake(int s){
    speed = speed - s;
  }

  public void display(){
    System.out.println("ナンバー" + no +"の速度は" + speed + "です");
  }
}
