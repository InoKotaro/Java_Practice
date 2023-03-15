public class NoObject {
  public static void main(String[] args) throws Exception {
    //============オブジェクト指向未適用ver.==================
    int [] score = {30, 70, 100};
    String[] name = {"弓木", "林", "与田"};

    for (int i = 0; i < score.length; i++){
      System.out.prinyln(name[i] + "さん: " + score[i] + "点");
    }

  }
}
