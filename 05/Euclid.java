class Euclid {
  int a;
  int b;
  public Euclid(int a, int b){
    if(a < b){
      int temp = a;
      this.a = b;
      this.b = temp;
    } else {
      this.a = a;
      this.b = b;
    }
  }
  public int euclidean(){
    int r;
    while(b != 0){
      r = a % b;
      a = b;
      b = r;
    }
    return a;
  }
  public int euclideanRecursive(){
    int r;
    if(b == 0){
      return a;
    } else{
      r = a % b;
      a = b;
      b = r;
      return euclideanRecursive();
    }
  }
  public static void main(String[] args){
    if (args.length != 2){
      System.out.println("input error");
      System.exit(1);
    }
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    Euclid calc = new Euclid(num1, num2);
    System.out.println(calc.euclidean());
    System.out.println(calc.euclideanRecursive());
  }  
}