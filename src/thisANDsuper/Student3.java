public class Student3 extends Person3{ //オーバーライド設定
  private int stuNo; //学籍番号
  
  public Student3(String name){ //引数名前だけパターン
    this(name, 999); //「this」は「Student3」ということなので、実質「Student3(name, 999)」をコンストラクタで呼び出している。
                     //引数が名前だけパターンに学籍番号999固定するために用意されたメソッド。
    // super(name); 
    // this.stuNo = 999; 
    //でも同じ出力結果になる
                     
  }

  public Student3(String name, int stuNo){ //引数名前,学籍番号ありパターン
    super(name); //super使用で「Person3クラス」内の「nameメンバ変数」に引数k代入()があるので最上行に書く    this.stuNo = stuNo; //「引数stuNo」をthis使用でメンバ変数の「stuNo」に代入
  }

  public void display(){
    super.display(); //super使用で「Person3クラス」にある「displayメソッド」」を引っ張ってきてくる。()があるので最上行に書く
    System.out.println("学籍番号: " + stuNo); //本クラス独自メソッド
  }
}
