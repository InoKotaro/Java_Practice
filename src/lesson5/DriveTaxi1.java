public class DriveTaxi1 {
  public static void main(String[] args) throws Exception {
    Taxi1 t1 = new Taxi1();

    t1.setNo(1234); //スーパークラスメソッド
    t1.start(); //サブクラスメソッド
    t1.run(); //サブクラスメソッド
    t1.display(); //サブクラスメソッド(オーバライド適用)
  }
}
