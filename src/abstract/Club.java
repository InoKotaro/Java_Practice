public abstract class Club { //クラス内に抽象メソッドがあるので、「public」の後に「abstract」を書いて抽象クラス化(ひとつでもあれば抽象クラスにする必要ある)
  //抽象クラスはサブクラスで継承して抽象メソッドをオーバーライドする必要がある
  private String name; //部活名

  public Club(String name){ //コンストラクタ
    this.name = name;
  }
  public void display(){
    System.out.println("部活動：" + name);
  }

  public abstract void practice(); //メソッド定義だけなので「abstract」を書いて抽象メソッドとして扱う
}
