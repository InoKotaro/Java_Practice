public class TandF extends Club{
  public TandF(String name){
    super(name);
  }

  public void practice(){ //オーバーライド適用可能
    System.out.println("ウォームアップ");
    System.out.println("インターバル");
    System.out.println("筋トレ");
  }
}
