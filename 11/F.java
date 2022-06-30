public class F{
  static int f(int n){
    if(n == 0) return 0;
    if(n == 1) return 1;
    int fa = f(n-2) + f(n-1);
    return fa;
  }
  public static void main(String[] args){
    int ans = f(6);
    System.out.println(ans);
  }
}