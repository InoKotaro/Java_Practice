//============抽象クラス==================
public class StuSample6 {
  public static void main(String[] args) throws Exception {
    //============抽象クラス==================
    //======================================

    TandF taf = new TandF("陸上競技");
    Football fb = new Football("サッカー");

    Student6 stu1 = new Student6("山本", taf);
    stu1.display();
    stu1.practice();

    Student6 stu2 = new Student6("野口", fb);
    stu2.display();
    stu2.practice();
  }
}
