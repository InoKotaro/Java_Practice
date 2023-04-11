//============オーバーライド==================
public class StuSample {
  public static void main(String[] args) throws Exception {
    //============オーバーロード==================
    //戻り値の型、メソッド名、引数の型と数を一致させる(要はコピペと同じ)
    //==========================================
    Student2 stu = new Student2();

    stu.setName("諸橋");
    stu.setStuNo(1);
    stu.display();
  }
}
