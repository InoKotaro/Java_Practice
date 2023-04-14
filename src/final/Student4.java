//============final============
public final class Student4 extends Person4{ //クラスに「final」を書くと孫クラスへ継承阻止
  private int stuNo;

  public Student4(String name, int stuNo){ //オーバーロード用メソッド
    super(name); //superクラス内の引数一つメソッドにname引数を渡す
    this.stuNo = stuNo; //このクラス内メンバ変数にstuNo引数を渡す
  }
  
  public void display(){
    super.display(); //スーパークラス内のdisplayメソッド呼び出し
    System.out.println("学籍番号: " + stuNo);
  }
}
