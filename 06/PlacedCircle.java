class Circle{
  int radius;//円の半径を格納するフィールド
  Circle(){
    //デフォルトは半径を1にセット
    setRadius(1);
  }
  Circle(int radius){
    //引数により半径をセット
    setRadius(radius);
  }
  //半径をセットするメソッド
  void setRadius(int radius){
    this.radius = radius;
  }
  //半径を返すメソッド
  int getRadius(){
    return radius;
  }
  public String toString(){
    return "(radius = " + getRadius() +")";
  }
}


class PlacedCircle extends Circle{
  int x, y;
  PlacedCircle(){
    setLocation(0, 0);
  } 
  PlacedCircle(int x, int y){
    setLocation(x, y);
  }
  PlacedCircle(int r, int x, int y){
    setRadius(r);
    setLocation(x, y);
  }
  void setLocation(int x, int y){
    this.x = x;
    this.y = y;
  }
  public String toString(){
    return "(" + x + ", " + y + ", " + radius + ")";
  }
  public static void main(String[] args){
    PlacedCircle c1 = new PlacedCircle();
    System.out.println(c1);
    PlacedCircle c2 = new PlacedCircle(12, 34);
    System.out.println(c2);
    PlacedCircle c3 = new PlacedCircle(12, 34, 45);
    System.out.println(c3);
  }
}


