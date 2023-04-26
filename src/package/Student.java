package pack; //パッケージ化

public class Student{ //クラス定義
  private  String name;

  public Student(String name){
    this.name = name;
  }

  public void display(){
    System.out.println("名前：" + name);
  }
}
