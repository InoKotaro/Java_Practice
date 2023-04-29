package mypack; //パッケージ化

public class Taxi extends Vehicle{

  public Taxi(int crewNum){
    super(crewNum); //スーパークラスのメンバ変数に値を渡すため「super」使用
  }

  public void showCrewNum(){ //抽象メソッド化
    System.out.println("タクシーの乗客数：" + super.showCrewNum + "名");
  }

  public void stop(){
    System.out.println("ここで降ります");
  }

}  