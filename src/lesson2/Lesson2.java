public class Lesson2 {
  public static void main(String[] args) throws Exception {

    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    //問題ごとにargs配列書き換え必要
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    // int height = Integer.parseInt(args[0]);
    // int width = Integer.parseInt(args[1]);
    // int area;

    // //面積計算
    // area = (width * height) / 2; //intとかでデータ型を書くのは初期化する時だけ
    //計算結果を小数点以下も求める時は「area」変数をdouble型にして、式も「/ 2.0」にする。
    //計算式は「int」と「double」で「double」型で答えが算出される。
    //反対に「int」と「int」は「int」で算出される

    // System.out.println("高さ: " + height);
    // System.out.println("幅: " + width);
    // System.out.println("面積: " + area);

    //=========================================================
    // int radius = Integer.parseInt(args[0]);
    // double pi = 3.141592;
    // double area;

    // area = radius * radius * pi;

    // System.out.println("半径: " + radius);
    // System.out.println("面積: " + area);
    
    // |
    // |小数点以下２位までを表示
    // |
    // V

    // int radius = Integer.parseInt(args[0]);
    // double pi = 3.141592;
    // double area;

    // area = radius * radius * pi;

    // //模範解答↓
    // area = (int)(area * 100);
    // area = area / 100;

    // System.out.println("半径: " + radius);
    // // System.out.println("面積: " + (Math.floor(area * 100))/100);
    // //模範解答↓ 出力部分で型変換するのではなく、上でキャストする。
    // System.out.println("面積: " + area);

    //=========================================================
    // int a = Integer.parseInt(args[0]);
    // int b = Integer.parseInt(args[1]);

    // if (a > b){
    //   System.out.println("大きいのは" + a + "です");
    // }else if(a < b){
    //   System.out.println("大きいのは" + b + "です");
    // }else{
    //   System.out.println("同じです");
    // }
    
    //=========================================================
    // int count = 1;
    // while(count <= 10){
    //   System.out.println(count + "回目: while文演習問題");
    //   count++;
    // }

    //=========================================================
    //↓初回記述
    //int a = Integer.parseInt(args[0]);

    // for(int i = 0; i < args.length; i++){
    //   System.out.println(args);
    // }

    //模範解答↓
    int i;
    for (i = 0; i < args.length; i++) {
     System.out.println(args[i]);
    }
    System.out.println(i);

    // 「int a = Integer.parseInt(args[0]);」みたく配列の番地を指定して
    // int型変数に代入するのはコンソールで入力した値で計算とかする為と区別して考える

    //変数を汎用的に使うには範囲外(今回であればfor文)で「int i;」で初期化する必要がある
    //そうなるとfor文の書き方が若干変わる(i = 0;でOKになる)
  }
}
