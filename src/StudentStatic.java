//============static(stuSample4)==================
public class StudentStatic {
  String name;
  static int counter = 0; //static化してクラス内で共有できるよう固定

  StudentStatic(String n){ //コンストラクタ化済み
    name = n;
    counter++;
    System.out.println(name + "さんをインスタンス化しました");
  }

  static void display(){ //インスタンス生成しなくても呼び出せるようにstatic化(ただ確認したいときとかに使える)
    System.out.println(counter + "人です");
  }
}
