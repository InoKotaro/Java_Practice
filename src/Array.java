public class Array {
  public static void main(String[] args) throws Exception {

    System.out.println("=========以下配列=========");
    //============================配列について==============================
    
    int[] score = new int[3];
    score[0] = 30;
    score[1] = 70;
    score[2] = 100;

    String[] name = {"弓木", "林", "与田"};

    System.out.println(name[0] + "さん：" + score[0] + "点");
    System.out.println(name[1] + "さん：" + score[1] + "点");
    System.out.println(name[2] + "さん：" + score[2] + "点");
    System.out.println("受験者数：" +  name.length + "人");  //score.lengthでも数えることが可能

    /*出力結果
    弓木さん：30点
    林さん：70点
    与田さん：100点
    受験者数：3人
    */
    System.out.println("=========以下多次元配列=========");
    //============================多次元配列について========================

    //表をイメージすると分かりやすいかも
    //初期化記述方法 初期化とは最初に値を定義すること
    //int [][] allScore = { {10, 20, 30}, {40, 50, 60} };
    

    int [][] allScore = new int [2][3]; //2行3列で作成パターン
    allScore[0][0] = 10;
    allScore[0][1] = 20;
    allScore[0][2] = 30;
    allScore[1][0] = 40;
    allScore[1][1] = 50;
    allScore[1][2] = 60;

    System.out.println(allScore[0][0] + "点");
    System.out.println(allScore[0][1] + "点");
    System.out.println(allScore[0][2] + "点");
    System.out.println(allScore[1][0] + "点");
    System.out.println(allScore[1][1] + "点");
    System.out.println(allScore[1][2] + "点");
    
    System.out.println("allScore.length：" + allScore.length);
    System.out.println("allScore[0].length：" + allScore[0].length);

    /*出力結果
    10点
    20点
    30点
    40点
    50点
    60点
    allScore.length：2  //行数が該当 今回の例は[0][1]の２つ
    allScore[0].length：3 //列数が該当 今回は[0]に入っている[0][1][2]の３つ
    */

    System.out.println("=========以下コマンドライン入力=========");
    //============================コマンドライン入力========================

    System.out.println("args[0]：" + args[0]);
    System.out.println("args[1]：" + args[1]);
    System.out.println("args.length：" + args.length);

    /*コンパイル後コマンドで「java Array(クラス名) Hello Java」入力で
    args[0]：Hello
    args[1]：Java
    args.length：2 //ここは入力した分だけ２つ以上でもカウントされる
    と出力される

    なお、今回はargsの[1]と[2]で引数が２つ必要なのに、コマンドで1つしか引数を渡さないと
    「Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
    Index 1 out of bounds for length 1」
    というエラーになる
    */

  }
}
