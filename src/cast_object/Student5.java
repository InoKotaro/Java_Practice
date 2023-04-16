public class Student5 extends Person5{
  private int stuNo;

  public Student5(String name, int stuNo){ //引数二つ設定
    super(name); //スーパークラスの引数一つコンストラクタ呼び出し
    this.stuNo = stuNo;
  }

  public void display(){ //オーバーライド
    super.display(); //スーパークラスのdisplayメソッド呼び出し 
    System.out.println("学籍番号：" + stuNo);
  }

  public void chgStuNo(int stuNo){
    this.stuNo = stuNo;
  }
}
