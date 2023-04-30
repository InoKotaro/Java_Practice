//============パッケージ化==================
import pack.Student; //使用するパッケージ化済みファイルを指定。[推奨]=>推奨書き方はクラスファイルがいっぱいあれば「import pack.*」を推奨。これで処理が重くなることはないため、とりあえず「.*」使えば可

public class StuSample {
  public static void main(String[] args) throws Exception {
    //============パッケージ化==================
    //コンパイル時のファイル構造を把握すればイメージしやすい
    //❗️コンパイル時手順(マニュアルver.)↓：
    //①パッケージ化したファイルをコンパイルする
    //②パッケージ化した際に命名したのと同じ名前のフォルダを作成する
    //③①で作成されたクラスファイルを②で作成したフォルダへ移動する
    //④実行用ファイルをコンパイル(通常取扱い)

    //❗️コンパイル時手順(オートver.)↓：
    //①コマンド「javac -d . *.java」でマニュアル手順①〜④を全自動化可能
    //②あとは通常取扱いで実行コマンド使用

    //「javac *.java」=> 適切な順番でにコンパイルよろしく
    //「-d」=> パッケージ化クラスがある際にディレクトリ(フォルダ)を自動で作ってくれるオプション
    //「.」=> この階層を指す
    //要は「パッケージ化クラスがあれば、この階層にディレクトリ作成してコンパイルよろしく」的なこと
    //========================================
    Student stu = new Student("佐々木");
    stu.display();
  }
  
}
