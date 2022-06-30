class Rectangle{ 
  int width; 
  int height; 
  Rectangle(){ 
    setSize(0, 0); 
  } 
  Rectangle(int width, int height){ 
    setSize(width, height); 
  } 
  void setSize(int width, int height){ 
    this.width = width; 
    this.height = height; 
  } 
  public String toString(){ 
    return "[" + width + ", " + height + "]"; 
  } 
}

class PlacedRectangle extends Rectangle{
  int x;
  int y;
  PlacedRectangle(){
    x = 0;
    y = 0;
  }
  PlacedRectangle(int x, int y){
    this.x = x;
    this.y = y;
  }
  PlacedRectangle(int width, int height, int x, int y){
    super.width = width;
    super.height = height;
    this.x = x;
    this.y = y;
  }
  void setLocation(int x, int y){
    this.x = x;
    this.y = y;
  }
  public String toString(){
    return "[(" + x + ", " + y + "), (" + width + ", " + height + ")]";
  }
  public static void main(String[] args){
    PlacedRectangle sample1 = new PlacedRectangle();
    System.out.println(sample1.toString());
    PlacedRectangle sample2 = new PlacedRectangle(123, 45);
    System.out.println(sample2.toString());
    PlacedRectangle sample3 = new PlacedRectangle(123, 45, 12, 34);
    System.out.println(sample3.toString());
  }

}

