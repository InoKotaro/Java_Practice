public class Car4 { //ここのクラス名はファイル名と一致させる(大文字で)
  private int no;
  private static int count = 0; //staticで共通化する。private,publicと併用可能

  public Car4(){ //コンストラクタ設定。引数なし時はナンバーを0にする
    no = 0;
    count++;
    System.out.println("ナンバーなしを作りました");
  }

  public Car4(int n){ //コンストラクタ設定。引数ある時はナンバーを指定できる
    no = n;
    count++;
    System.out.println("ナンバー" + no + "作りました");
  }

  public static void display(){ //設計図クラスでメソッドをstatic化した際は、実行用クラスも書き換えが必要
    System.out.println(count + "台作成済みです");
  }

}