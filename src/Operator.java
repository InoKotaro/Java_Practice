public class Operator {
  
 public static void main(String[] args) throws Exception {

  //①算術演算子
  // 7 / 2 → 3 //余りは非表示
  // 7 % 2 → 1 //余りだけ表示

  //②代入・複合代入演算子
  // a += b →  a = a + b と同じ

  //③インクリメント演算子・デクリメント演算子
  // a++ → a = a + 1 または a += 1 と同じ 
  //======================================================

  int a = Integer.parseInt(args[0]);
  int b = Integer.parseInt(args[1]);

  System.out.println("a = " + a + ",b = " + b);
  System.out.println("a + b = " + (a + b));
  
  }
}
