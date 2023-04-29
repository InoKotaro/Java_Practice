//インターフェースファイル(今回はこのファイルがポイント)
public interface Englishable{ //インターフェース化(ファイル内処理が、定数or抽象メソッドになる)
//❗️「クラス」という概念ではないため、「public」の後はすぐ「interface」になる

  String LANGUAGE = "[英語]"; //自動で定数化される(finalがあるとして扱われる)
  void displayEng(); //自動で抽象メソッド化される(abstractがあるとして扱われる)
  //❗️「public」は不要
}
