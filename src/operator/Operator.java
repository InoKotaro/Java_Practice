package operator;
public class Operator {
  
 public static void main(String[] args) throws Exception {

  //============================演算子について================================

  //①算術演算子
  // 7 / 2 → 3 //余りは非表示
  // 7 % 2 → 1 //余りだけ表示

  //②代入・複合代入演算子
  // a += b →  a = a + b と同じ

  //③インクリメント演算子・デクリメント演算子
  // a++ → a = a + 1 または a += 1 と同じ 

  //④関係演算子
  // a >= 0 で a が0以上であれば true が返される(boolean型で返ってくる)

  //⑤論理演算子
  // (a >= 0) && (b >= 0) 関係演算子同士を評価して、結果をboolean型で返す
  // 「&&」が「且つ」、「||」が「どっちかが」
  //========================================================================

  int a = Integer.parseInt(args[0]); //カッコ内に指定した文字列をint型に変換されて変数aが整数に置き換わる
  int b = Integer.parseInt(args[1]);

  System.out.println("a = " + a + ",b = " + b);
  System.out.println("a + b = " + (a + b));
  System.out.println("a - b = " + (a - b));
  System.out.println("a * b = " + (a * b));
  System.out.println("a / b = " + (a / b));
  System.out.println("a % b = " + (a % b));
  System.out.println("a >= 0 : " + (a >= 0));
  System.out.println("(a >= 0) && (b >= 0) : " + ((a >= 0) && (b >= 0)));
  
  /*出力結果
  a = 2,b = 3
  a + b = 5
  a - b = -1
  a * b = 6
  a / b = 0
  a % b = 2
  a >= 0 : true
  (a >= 0) && (b >= 0) : true //「&&」や「||」は真偽値で返される
  ターミナルで引数に数値ではなく文字を入力すると
  「Integer.parseInt」で数値に変換したいのに文字が引数になってる胸の
  「NumberFormatException」というエラーになる
  */
  }

}
