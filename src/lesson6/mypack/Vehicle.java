package mypack; //パッケージ化

public abstract class Vehicle { //抽象メソッドがあるため「abstract」書く
  protected int crewNum; //protectedが正。「private」「protected」「public」で公開範囲を指定可能
  //「protected」は自分のクラスとサブクラスまでアクセス許可。今回は「crewNumメンバ変数」を共有したいので「protected」使用

  public abstract void showCrewNum(); //「abstract」で抽象メソッド化
}
