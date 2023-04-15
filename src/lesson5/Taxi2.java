public class Taxi2 extends Car2 {
  private int price; //メンバ変数(料金),一応static化
  //private int no;

  public Taxi2(int no){ //引数ナンバーだけパターン
    this(no, 0); //上段でナンバー引数を受け取り、「this()」で本クラス内の引数二つメソッドに引き継ぐ
    //間違い => this.no = no; //noに引数代入
  }

  public Taxi2(int no, int price){ //引数ナンバー,料金パターン
    super(no); //❗️スーパークラスのメソッド使う時は、スーパー側のメソッドはコンストラクタ化されてるか要確認
    //間違い => this.no = no;
    this.price = price; //引数分が加算される
  }
   
  public void start(){
    price = price + 420; //priceメンバ変数に420加算
  }

  public void run(){
    price = price + 80; //priceメンバ変数に80加算
  }

  public void display(){
    super.display(); //スーパークラスのメソッド呼び出し(オーバライドと区別して考える)
    //間違い => System.out.println("ナンバーは" + no + "です"); 
    System.out.println("料金は" + price + "円です"); //Car1クラスのdisplayメソッドをオーバーライドする
  }
}
