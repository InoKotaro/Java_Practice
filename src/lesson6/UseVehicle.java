import mypack.*; //「import」で使用パッケージ定義。❗️「.*」を忘れないように

public class UseVehicle {
  public static void main(String[] args) throws Exception {
    Vehicle[] v = new Vehicle[3];
    v[0] = new Taxi(4); //サブクラスをスーパークラスへ型変換実施
    v[1] = new Train(160);
    v[2] = new Bus(60);

    for(int i = 0; i < v.length; i++){
      v[i].showCrewNum(); //乗車人数出力
      if(v[i] instanceof Stopable){ //Stopableインスタンスがあれば
        Stopable s = (Stopable)v[i];
        s.stop(); //停まる旨コメント出力
      }
    }
  }
}
