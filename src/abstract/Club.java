abstract class Club { //abstractで抽象クラス化
  private String name; //部活名

  public Club(String name){
    this.name = name;
  }
  public void display(){
    System.out.println("部活動：" + name);
  }
  public abstract void practice(); 
}
