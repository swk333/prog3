class Square {
  int side;
  Square() {
    this.side = 10;
  }
  Square(int num) {
    this.side = num;
  }
  int getArea() {
    return this.side * this.side; 
  }
  public static void main(String[] args){
    Square sample = new Square();
    System.out.println(sample.getArea());
    Square sample2 = new Square(5);
    System.out.println(sample2.getArea());
  }
}