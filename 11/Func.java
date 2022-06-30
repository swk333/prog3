class Func{
  public static int f(int n){ 
    int result = n; 
    if(n < 1) return result;
    else return result += f(n - 1);
    
  }
  public static void main(String args[]){
    System.out.println(f(5));
  }
}