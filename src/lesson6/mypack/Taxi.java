package mypack; //パッケージ化

public class Taxi extends Vehicle implements Stopable{ //ehicleクラス継承。「interface」メソッドを実装するので「implements」で使うファイルを定義

  public Taxi(int crewNum){
    this.crewNum = crewNum; //スーパークラスを継承しているため、自分のクラスにあるかの如く変数は「this」使用可能
    //super(crewNum); //誤り：これでは別メソッド(スーパークラスの引数一つメソッド)をコンストラクタで呼び出すことになる
  }

  public void showCrewNum(){ //抽象メソッド化
    System.out.println("タクシーの乗客数：" + crewNum + "名");
  }

  public void stop(){
    System.out.println("ここで降ります");
  }

}  