public class Cast {
  public static void main(String[] args) throws Exception {

    //============================キャストについて================================
    // キャストとはデータ型のサイズを大きいものから小さいものに「(int)」など型を明示して手動で変換すること
    // 小さいものから大きいものへは「大は小を兼ねる」ように自動で変換されるのでキャストは不要
    //char型もキャストは可能だが滅多にない。boolean型は真偽値なのでキャスト不可(サイズ変換の概念がないのかも)
    // | byte
    // | short
    // | int
    // | long
    // | float
    // V double
    //の順でサイズが大きくなる //箱のサイズと考えるとイメージしやすい
    //よってfloatからintに変換すると箱のサイズが収まらない為キャスト「（int）」で明示を書かないとコンパイルエラーになる
    //=========================================================================

    int price = Integer.parseInt(args[0]); //本体価格をコマンドライン入力
    double rate = 0.08; //消費税
    int amount; //合計額

    amount = (int)(price * (1 + rate)); //本体価格+消費税
    //①最初に(1 + rate)が処理されて1.08になる
    //②本体価格*1.08が処理される
    //③で算出された額の小数点以下を(int)でキャストして切り捨てる //intは整数のみを扱うため
    System.out.println("税込金額: " + amount + "円");
  }
}