public class Branch3 {
  public static void main(String[] args) throws Exception {

    //============================分岐について(switch文ver.)==============================
    //基本的にはif文を使う。if文では書けるがswitch文では書けないものがある
    //if-else文でも同じ処理を書けるが、ケースに応じてswitch文と使い分ける必要がある
    //==================================================================================
    int num = Integer.parseInt(args[0]); //本体価格をコマンドライン入力
    switch(num){
      case 1: //「;」セミコロンではなく「:」コロン
        System.out.println("入園料金: 8,400円");
        break; //breakでswitch範囲解除。書かないと下の処理も実行される
      case 2:
        System.out.println("入園料金: 7,000円");
        break;
      case 3:
        System.out.println("入園料金: 5,000円");
        break;
      default: //defaultはelseみたいな感じ。条件不一致で実行される
        System.out.println("1: 一般, 2: 中・高校生, 3: 小学生・幼児");
    }
  }
}
