public class stuSample4 {
  public static void main(String[] args) throws Exception {
  //============final==================
  //finalを書くことで継承、メンバ変数への代入、メソッドのオーバーライドを阻止できる
  //メンバ変数への代入を阻止すると「定数」を定義することが可能になる。定数名は全て大文字で書く
  //====================================
    final int BASE_NO = 1000; //定数は変数名を全て大文字で書く(finalで定数化)

    Student4 stu1 = new Student4("佐々木", BASE_NO + 1); 
    stu1.display();

    Student4 stu2 = new Student4("山本", BASE_NO + 2); 
    stu2.display();
    //stu3.display2(); //この時点で「stu3」は生成されていないためコンパイルエラーになる
    //※プログラムは上から読まれる特徴があるため

    DameStudent stu3 = new DameStudent("柏木", BASE_NO + 3);
    stu3.display();
   }
}
