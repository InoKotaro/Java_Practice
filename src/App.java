public class App {
  public static void main(String[] args) throws Exception {
  
    /*============================型について================================ */

    /*変数に代入可能な型は基本データ型、参照型がある
    基本データ型はデータの種類を指す(整数、小数、文字列など8種類)
    参照型はデータ型以外の種類(文字列、配列など)
    整数＝>int
    小数＝>float(語尾にfを書く)
    小数＝>double
    文字＝>char、'A'で囲う(シングルクオーテーション)
    */

    int month = 12;
    int day = 24;
    float wight = 90.5f;
    double hight = 175.5;
    char testAlphabet = 'A';
    String name = "サンタ";


    System.out.println(month + "月" + day + "日は");
    System.out.println("メリクリの日");
    System.out.println(name + "さんは大忙し");
    System.out.println("体重は" + wight + "kg");
    System.out.println("身長は" + hight + "cmだそうです");
    System.out.println("char型のアルファベットは" + testAlphabet + "でした");

    /*==================================================================== */
  }
}
