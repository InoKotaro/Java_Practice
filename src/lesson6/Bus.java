package mypack; //パッケージ化

public class Bus extends Vehicle{ //Vehicleクラス継承
  public Bus(int crewNum){
    super(crewNum); //スーパークラスのメンバ変数に代入
  }

  public void showCrewNum(){
    System.out.println("バスの乗客数：" + super.showCrewNum + "名");
  }

  public void stop(){
    System.out.println("次、停まります");
  }
}
