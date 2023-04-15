public class stuSample {
  public static void main(String[] args) throws Exception {
  //============継承==================
  //継承することで、あたかも自分のクラスにあるようかのにメソッドを使えるようになる(Studentクラスにないメソッドも使えるイメージ)
  //継承できるクラスは1つだけ。コンストラクタは継承不可。
  //====================================
  Student stu = new Student(); //オブジェクト生成
  
  //スーパークラス(Person)のメソッド
  stu.setName("佐々木"); //「Studentクラス」内で「Personクラス」を継承しているので「Studentクラス」に無い「setNameメソッド」を使用可能になっている
  stu.display();

  //サブクラス(Student)のメソッド
  stu.setStuNo(1);
  stu.displayStuNo();
  }
}
