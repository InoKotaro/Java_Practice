//============継承============
public class Student extends Person { //「extends」でPersonクラス継承
  private int stuNo; //メンバ変数定義

  public void setStuNo(int sn){
    stuNo = sn;
  }

  public void displayStuNo(){
    System.out.println("学籍番号: " + stuNo);
  }
}
