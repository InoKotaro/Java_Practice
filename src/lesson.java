public class Lesson {
  public static void main(String[] args) throws Exception {
  
    System.out.println("=========演習問題1=========");
    //演習問題1
    int num = 10;
    double pi = 3.14;
    char blood = 'A';
    boolean fun = true;
    String msg = "こんにちは";

    System.out.println(num);
    System.out.println(pi);
    System.out.println(blood);
    System.out.println(fun);
    System.out.println(msg);

    //個人的注意ポイント
    //cherはシングルクオーテーション

    System.out.println("=========演習問題2=========");
    //演習問題2
    int[] score = new int[4];

    score[0] = 90;
    score[1] = 80;
    score[2] = 100;
    score[3] = 90;

    // System.out.println("1人目は" + score[0] + "点");
    // System.out.println("2人目は" + score[1] + "点");
    // System.out.println("3人目は" + score[2] + "点");
    // System.out.println("4人目は" + score[3] + "点");

    for (int i = 0; i < score.length; i++){
      System.out.println((i+1) + "人目は" + score[i] + "点");
    }

    //個人的注意ポイント
    //配列に変数名をつける
  }
}