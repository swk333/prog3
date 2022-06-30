   //1変数関数を表す抽象クラスFunction
abstract class Function{
  //関数値f(x)を返す抽象メソッド      
  abstract public double f(double x);      
  //関数f(x)を微分して得られる関数を返す抽象メソッド      
  abstract public Function differentiates();
}

public class Polynomial extends Function{
//フィールド
  // 多項式の次数
  private int degree;
  // 多項式の係数及び定数項を格納する長さがdegree + 1の配列
  // • coefficients[0]は定数項を格納する．     
  // • coefficients[i]はi次の係数を格納する．    
  // • coefficients[degree]が最高次数degreeの係数を格納する． 
  private double[] coefficients;

  Polynomial(double[] coefficients){
    this.coefficients = coefficients;
  }

//メソッド   
  //• 関数値f(x)を返す抽象メソッド
  public double f(double x){
    double ans = 0;
    for(int i = 0; i < coefficients.length; i++){
      if(i == 0) ans+=coefficients[i];
      else ans += coefficients[i] * Math.pow(x, i);
      // System.out.println(ans);
    }
    return ans;
  }
  //• 多項式を微分する抽象メソッド
  public Function differentiates(){
    double[] ans = new double[coefficients.length - 1];
    for(int i = 1; i < coefficients.length; i++){
      ans[i-1] = coefficients[i] * i;
      // System.out.println(i + "ans[i]=" + ans[i-1]);
    }
    Polynomial y = new Polynomial(ans);
    return y;
  } 
  //• 多項式の文字列表現を返す
  public String toString(){
    String str = "";
    for(int i = coefficients.length - 1; i >= 0; i--){
      if(i == 0) {
        str += coefficients[i];
      }else if(i == 1){
        str += coefficients[i] + "x + ";
      }else {
        str += coefficients[i] + "x^" + i + " + ";
      }
    }
    return str;
  }


  public static void main (String[] args){
    double[] coefficients = {1, 2, 3};    
    //p(x) = 3x^2 + 2x + 1    
    Polynomial p = new Polynomial(coefficients);    
    //p(x) = 3x^2 + 2x + 1を表示    
    System.out.println("p(x) = " + p);  
    //p(2) = 11  
    System.out.println("p(" + 2 + ") = " + p.f(2));  
    //p’(x) = q(x) = 6x + 2  
    Function q = p.differentiates();  
    //p’(x) = q(x) = 6x + 2を表示  
    System.out.println("q(x) = " + q);  
    //q(2) = 14  
    System.out.println("q(" + 2 + ") = " + q.f(2));  
  }
}