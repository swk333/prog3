class Point2D{
  private double x;
  private double y;
  public Point2D(double x, double y){
    this.x = x;
    this.y = y;
  }
  //: フィールドxの値を返すゲッタ
  public double getX(){
    return x;
  }
  //: フィールドxの値を引数xでセットするセッタ
  public void setX(double x){
    this.x = x;
  }
   //フィールドyの値を返すゲッタ．
  public double getY(){
    return y;
  }
  //フィールドyの値を引数yでセットするセッタ．
  public void setY(double y){
    this.y = y;
  }
  //this と原点からの距離を返すメソッド
  public double getDistance(){
    double a = Math.pow(x, 2);
    double b = Math.pow(y, 2);
    double ans = Math.sqrt(a+b);
    return ans;
  }
  //: 座標の文字列表現”(x, y)”を返すメソッド．
  public String toString(){
    return "(" + x + ", " + y + ")";
  }
}

class Point3D extends Point2D{
  private double z;
  public Point3D(double x, double y, double z){
    super(x, y);
    this.z = z;
  }
  //フィールドzの値を返すゲッタ
  public double getZ(){
    return z;
  }
  //フィールドzの値を引数zでセットするセッタ
  public void setZ(double z){
    this.z = z;
  }
  //this と原点からの距離を返すメソッド
  public double getDistance(){
    double a = Math.pow(getX(), 2);
    double b = Math.pow(getY(), 2);
    double c = Math.pow(z, 2);
    double ans = Math.sqrt(a+b+c);
    return ans;
  }
  //座標の文字列表現"(x, y, z)”を返すメソッド．
  public String toString(){
    return "(" + getX() + ", " + getY() + ", " + z + ")";
  } 
}

public class PointMain{
  public static void main(String[] args){
	  double x = 2;
    double y = 3;
    double z = 4;
    Point2D p2 = new Point2D(x, y);
    System.out.println("p2 = " + p2);
    System.out.println("|p2| = " + p2.getDistance());
    Point3D p3 = new Point3D(x, y, z);
    System.out.println("p3 = " + p3);
    System.out.println("|p3| = " + p3.getDistance());
  }
}
