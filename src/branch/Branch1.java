public class Branch1 {
  public static void main(String[] args) throws Exception {

    //============================分岐について(if文ver.)==============================
    //どちらかの処理しか実行されない
    //else以降は省略可能
    //条件一つであれば波カッコを省略可能だがしない方がいい(可読しにくくなる)
    //結果はboolean型(真偽値)で返ってくる
    //=============================================================================

    int price = Integer.parseInt(args[0]); //本体価格をコマンドライン入力
    double rate = 0.1; //消費税
    int discount, amount; //割引額と合計額  /  同じデータ型はカンマで区切れば違う変数も定義可能

    if(price >= 3000){ //割引額判定
      discount = 300;
    }else{
      discount = 0;
    }

    amount = (int)((price - discount) * (1 + rate)); //本体価格+消費税
    //①if文で採用された方のdiscount変数を使って割引額を減額
    //②最初に(1 + rate)が処理されて1.08になる
    //③本体価格*1.08が処理される
    //④③で算出された額の小数点以下を(int)でキャストして切り捨てる //intは整数のみを扱うため
    System.out.println("割引金額: " + discount + "円");
    System.out.println("税込金額: " + amount + "円");
  }
}
