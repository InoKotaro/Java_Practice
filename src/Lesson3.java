public class Lesson3 {
  public static void main(String[] args) throws Exception {
    Lesson3Car c1 = new Lesson3Car(); //オブジェクト生成

    c1.setNo(123); //c1オブジェクトにナンバー設定
    c1.run(30); //c1オブジェクトに速度設定
    c1.display(); //ナンバー、速度表示
    c1.stop(); //速度0にする
    c1.display(); //ナンバー、速度表示(この時点は速度0)
  }
}