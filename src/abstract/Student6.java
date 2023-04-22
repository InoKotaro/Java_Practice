public class Student6 {
  private String name; //名前メンバ変数
  private Club club; //Clubクラスの変数を定義。❗️これがポイントかもしれない

  public Student6(String name, Club club){
    this.name = name;
    this.club = club;
  }

  public void display(){
    System.out.println("名前：" + name);
    club.display(); //メソッド呼び出し
  }

  public void practice(){
    club.practice(); //メソッド呼び出し
  }
}
