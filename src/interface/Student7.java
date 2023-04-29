public class Student7 implements Englishable{ //「implements」で「Englishableクラス」を実装する旨定義
  private String name;

  public Student7(String name){
    this.name = name;
  }

  public void display(){
    System.out.println("名前: " + name);
  }

  public void displayEng(){
    System.out.println(Englishable.LANGUAGE); //「Englishable」内にある「LANGUAGE定数」を表示。定数呼び出しも可能
    System.out.println("Name: " + name);
  }
}
