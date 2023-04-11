public class Person3 {
  private String name; //名前

  public Person3(String name){ //引数が一つなのでサブクラスで「super(name)」と書かれれば、このメソッドが呼び出される
    this.name = name; //this使用(「本クラスの」nameメンバ変数に代入)
  }

  public void display(){
    System.out.println("名前: " + name);
  }
  
}
