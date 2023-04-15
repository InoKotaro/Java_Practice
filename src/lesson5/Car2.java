public class Car2 {
  private int no; //メンバ変数(ナンバー)

  public Car2(int no){ //コンストラクタ使用時はvoidとか不要
    this.no = no;
  }

  public void display(){
    System.out.println("ナンバーは" + no + "です");
  }
}
