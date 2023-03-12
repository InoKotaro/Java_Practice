public class Loop1 {
  public static void main(String[] args) throws Exception {

  //======================繰り返しについて(while文ver.)=========================
  //条件がtrueである限り範囲内の処理を繰り返す
  //=========================================================================

    int i = 0; //iを0に初期化
    while( i < 3 ){ //条件式
      System.out.println("i = " + i);
      i++; //「++」を文末に書いてiに1足して条件式に返す(カウントアップ)
    }
  }
}
