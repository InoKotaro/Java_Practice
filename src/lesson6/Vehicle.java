package mypack; //パッケージ化

public abstract class Vehicle { //抽象メソッドがあるため「abstract」書く
  private int crewNum;

  public Vehicle(int crewNum){ //コンストラクタ
    this.crewNum = crewNum;
  }

  public abstract void showCrewNum(); //「abstract」で抽象メソッド化
}
