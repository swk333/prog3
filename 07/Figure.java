class Figure{
  public String name; 
  public Figure(){ 
    this.name = "Figure"; 
  } 
  public double getArea(){ 
    return -1.0; 
  } 
  public static void main(String[] args){ 
    Figure f = new Figure(); 
    System.out.println(f.name);//(1) 
    System.out.println(f.getArea());//(2) 
    f = new Square(10.0); 
    System.out.println(f.name);//(3) 
    System.out.println(f.getArea());//(4) 
  } 
}

class Square extends Figure{ 
  double side; 
  public Square(){ 
    this.name = "Square"; 
    this.side = 1.0; 
  } 
  public Square(double side){ 
    this.name = "Square"; 
    this.side = side; 
  } 
  public double getArea(){ 
    return side*side; 
  } 
}