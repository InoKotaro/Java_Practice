public class Person2 {
  private String name;

  public void setName(String n){
    name = n;
  }

  public String getName(){
    return name; //「return 変数名」とすることでメソッド自体が変数同等になる
  }

  public void display(){
    System.out.println("名前: " + name);
    }
  }