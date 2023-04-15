public class Taxi1 extends Car1 {
  static private int price; //メンバ変数(料金),一応static化

  public void start(){
    price = price + 420; //priceメンバ変数に420加算
  }

  public void run(){
    price = price + 80; //priceメンバ変数に80加算
  }

  public void display(){
    System.out.println("料金は" + price + "円です"); //Car1クラスのdisplayメソッドをオーバーライドする
  }
}
