package mypack; //パッケージ化

public class Train extends Vehicle{ //「Vehicleクラス」を継承

  public Train(int crewNum){
    this.crewNum = crewNum; ////スーパークラスを継承しているため、自分のクラスにあるかの如く変数は「this」使用可能
    //super(crewNum); //誤り：これでは別メソッド(スーパークラスの引数一つメソッド)をコンストラクタで呼び出すことになる
  }

  public void showCrewNum(){ //抽象メソッド化
    System.out.println("電車の乗客数：" + crewNum + "名");
  }
}
