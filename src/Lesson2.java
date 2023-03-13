public class Lesson2 {
  public static void main(String[] args) throws Exception {

    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    //問題ごとにargs配列書き換え必要
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    // int height = Integer.parseInt(args[0]);
    // int width = Integer.parseInt(args[1]);
    // int area;

    // //面積計算
    // area = (width * height)/2; //intとかでデータ型を書くのは初期化する時だけ

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

    // System.out.println("半径: " + radius);
    // System.out.println("面積: " + (Math.floor(area * 100))/100);

    //=========================================================
    // int a = Integer.parseInt(args[0]);
    // int b = Integer.parseInt(args[1]);

    // if (a > b){
    //   System.out.println("大きいのは" + a + "です");
    // }else{
    //   System.out.println("大きいのは" + b + "です");
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
    
    //↓記事参照記述
    // for(String s:args){
    //   System.out.println(s);
    //   }

    //↓上記参照記述と同じ(省略前)
    for (int i = 0; i < args.length; i++) {
      String str = args[i];
      System.out.println(str);
    }

    // 「int a = Integer.parseInt(args[0]);」みたく配列の番地を指定して
    // int型変数に代入するのはコンソールで入力した値で計算とかする為
    // 今回みたく入力した値を上限なく出力する時はfor文内で配列を文字列型変数に代入して出力させる
  }
}
