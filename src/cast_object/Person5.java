public class Person5 {
  private String name;

  public Person5(String name){ //コンストラクタ使用。使用時は返り値の型(void)とか不要
    this.name = name;
  }

  public void display(){ //オーバーライド前
    System.out.println("名前：" + name);
  }
}
