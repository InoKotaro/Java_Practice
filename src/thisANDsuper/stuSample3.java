//============this,super==================
public class stuSample3 {
  public static void main(String[] args) throws Exception {
    //============this,super==================
    //「this.」「super.」はメンバ変数,メソッド呼び出し、「this()」「super()」コンストラクタ呼び出しで使う
    //メリット：thisを使うと「本クラスの」ということになるため、引数をメンバ変数と同じ名前にできてわかりやすくなる
    //留意点：「this()」「super()」はコンストラクタ内の最上行に書く(基本的に優等なスーパークラスのメソッドを適用する仕様なため)
    //========================================
    Student3 stu1 = new Student3("佐々木"); //引数名前のみver.オブジェクト生成

    stu1.display(); //シンプルに「Student3クラス」の「displayメソッド」

    Student3 stu2 = new Student3("野口", 100); //引数名前,番号ありver.オブジェクト生成

    stu2.display();
  }
}
