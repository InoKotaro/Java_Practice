public class Person { //全員共通事項
 private String name; //メンバ変数定義
 
 public void setName(String n){ //nameメンバ変数に名前代入
  name = n;
 }

 public void display(){ //表示
  System.out.println("名前: " + name);
 }
}
