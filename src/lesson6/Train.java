package mypack; //パッケージ化

public class Train extends Vehicle{ //「Vehicleクラス」を継承

  public Train(int crewNum){
   super(crewNum); //スーパークラスのメンバ変数に値を渡すため「super」使用
  }

  public void showCrewNum(){ //抽象メソッド化
    System.out.println("電車の乗客数：" + super.showCrewNum + "名");
  }
}
