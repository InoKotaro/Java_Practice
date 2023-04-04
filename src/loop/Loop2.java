public class Loop2 {
  public static void main(String[] args) throws Exception {
  //======================繰り返しについて(for文ver.)=========================
  //while文と同じく条件がtrueである限り範囲内の処理を繰り返す
  //while分と違いはカッコ内にカウンタ変数の初期化(int i = 0;)、カウンタ変数のインクリメント(1++)を書ける(ここは;不要)
  //=========================================================================

    for(int i = 0; i < 3; i++){
      System.out.println("i = " + i);
    }
  
    System.out.println("=========以下配列for文出力=========");
    //=============================================

    int[] score = new int[3];
        score[0] = 30;
        score[1] = 70;
        score[2] = 100;

        String[] name = {"弓木", "林", "与田"};

    for(int i = 0; i < 3; i++){ //条件はシンプルに配列数[3]でOK
      System.out.println(name[i] + "さん：" + score[i] + "点");
    }
    System.out.println("受験者数：" +  name.length + "人");  //score.lengthでも数えることが可能
    
  }
}
