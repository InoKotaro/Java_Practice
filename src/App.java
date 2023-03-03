public class App {
  public static void main(String[] args) throws Exception {
  
    /*============================型について================================*/

    /*変数に代入可能な型は基本データ型、参照型がある
    基本データ型はデータの種類を指す(整数、小数、文字列など8種類)
    整数＝>int
    小数＝>float(語尾にfを書く)
    小数＝>double
    文字＝>char、'A'で囲う(シングルクオーテーション)

    参照型はデータ型以外の種類(文字列、配列など)
    しかも頭文字は大文字
    文字列=>String

    基本データ型と参照型の違いは
    基本データ型=>変数そのものに値が入る
    参照型=>変数に参照値(データがある番地)が入り、変数の中身を使うときは参照値から値を引っ張ってくる
    なぜ文字列は参照型なのか=>文字列になるとただの文字と違い、何文字になるか予測できない為、容量的に非効率であるため
    */

    // int month = 12;
    // int day = 24;
    // float wight = 90.5f; /* fを書かないとエラーになる */
    // double hight = 175.5;
    // char testAlphabet = 'A';
    // String name = "サンタ"; /* ここが参照型*/


    // System.out.println(month + "月" + day + "日は");
    // System.out.println("メリクリの日");
    // System.out.println(name + "さんは大忙し");
    // System.out.println("体重は" + wight + "kg");
    // System.out.println("身長は" + hight + "cmだそうです");
    // System.out.println("char型のアルファベットは" + testAlphabet + "でした");

    /*出力結果
      12月24日は
      メリクリの日
      サンタさんは大忙し
      体重は90.5kg
      身長は175.5cmだそうです
      char型のアルファベットはAでした
     */

    /*====================================================================*/

    /*============================配列について==============================*/
    
    int[] score = new int[3];
    score[0] = 30;
    score[1] = 70;
    score[2] = 100;

    String[] name = {"弓木", "林", "与田"};

    System.out.println(name[0] + "さん：" + score[0] + "点");
    System.out.println(name[1] + "さん：" + score[1] + "点");
    System.out.println(name[2] + "さん：" + score[2] + "点");
  }
}
