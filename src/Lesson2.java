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

    int radius = Integer.parseInt(args[0]);
    double pi = 3.141592;
    double area;

    area = radius * radius * pi;

    System.out.println("半径: " + radius);
    System.out.println("面積: " + (Math.floor(area * 100))/100);
    
  }
}
