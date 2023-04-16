public class stuSample5 {
  public static void main(String[] args) throws Exception {
    Student5 stu1 = new Student5("佐々木", 1);
    Person5 psn = stu1; //サブクラスをスーパークラスに代入(Student5=>Person5に管轄を移す)。サブクラス(大枠,アレンジ後)内にスーパークラス(小枠,ベース)があるのでスーパークラスの情報は既に把握しているため、キャストは自動で処理される
    psn.display(); //この時点で管轄はスーパークラス(Person5)なっている。❗️ただしメソッドはオーバーライドされる(サブクラスのメソッドが呼び出される)
    //psn.chgStuNo(100); //スーパークラス側からはサブクラス内メソッドは把握不可なためコンパイルエラーになる

    if(psn instanceof Student5){ //「instanceof」で「psn」は「Student5」のインスタンスかを判別できる。3行目で
      Student5 stu2 = (Student5)psn; //スーパークラス(ベース)をサブクラス(アレンジ後)に手動でキャストして代入。スーパークラスをサブクラスとして使うと把握していないメソッドがあるかもしれないということでコンパイルエラーになるため明示する必要がある
      stu2.chgStuNo(100); //管轄がサブクラスに戻ってきたので、サブクラス内メソッドはもちろん普通に使える
      stu2.display(); //オーバーロード後の「displayメソッド」が適用される
    }
  }
}
