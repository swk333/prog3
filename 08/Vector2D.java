abstract class Vector{
    //ベクトルの次元を格納するフィールド．
    private int dimension;
    // ベクトルの各要素を格納するフィールド，長さはdimension．
    private double[] elements;
    // デフォルトはdimension = 2で初期化する
    public Vector(){
        this.dimension = 2;
    }
    // 引数 dimension でフィールドdimensionを初期化し，フィールドelements を長さdimensionの配列として初期化する．
    public Vector(int dimension){
        this.dimension = dimension;
        this.elements = new double[dimension];
    }
    //フィールドdimension を返すゲッタ
    public int getDimension(){
        return dimension;
    }
    // フィールド dimension をセットし，フィールドelements を長さdimension で初期化するセッタ．
    public void setDimension(int dimension){
        this.dimension = dimension;
        this.elements = new double[dimension];
    }
    //フィールドelementsのi番目の要素を返すゲッタ
    public double getElement(int i){
        return elements[i];
    }
    // フィールドelementsのi番目の要素を引数eでセットするセッタ．
    public void setElement(int i, double e){
      this.elements[i] = e;
    }
    // ベクトルの文字列表現(x1, x2, ..., xn)を返すメソッド．
    public String toString(){
      String str = "";
      for(int i = 0; i < elements.length; i++){
        if(i == 0) {
          String s = "(" + elements[i] + ", ";
          str = str + s;
        } else if(i == elements.length - 1) {
          String s = elements[i] + ")";
          str = str + s;
        } else {
          String s = elements[i] + ", ";
          str = str + s; 
        }
      }
      return str;
    }
    //this と v の内積を返す抽象メソッド．
    abstract double innerProduct(Vector v);
    //this を scalar 倍して得られるベクトルscalar*this を返す抽象メソッド．
    abstract Vector scalarMultiplication(double scalar);
    //this と v との加算により得られるベクトルthis + vを返す抽象メソッド．
    abstract Vector addVector(Vector v);
}



public class Vector2D extends Vector{
    //コンストラクタ
    //スーパークラスのコンストラクタによりdimensionを2で初期化する
    public Vector2D(){
      super(2);
    };
    //コンストラクタ，スーパークラスのコンストラクタにより
    //dimensionを2で初期化し，続けて
    //フィールドelementsの0番目の要素をxで
    //フィールドelementsの1番目の要素をyで初期化する
    public Vector2D(double x, double y){
      super(2);
      setElement(0, x);
      setElement(1, y);
    };
    
    //abstract double innerProduct(Vector v)を実装
    //thisの0番目の要素とvの0番目の要素の積と
    //thisの1番目の要素とvの1番目の要素の積
    //の和によりthisとvの内積を求めるメソッド
    public double innerProduct(Vector v){
      return getElement(0) * v.getElement(0) + getElement(1) * v.getElement(1);
    };
    
    //abstract double scalarMultiplication(double scalar)
    //を実装 
    //thisの各要素にscalarを掛けた値を要素とする
    //vector，scalar * thisを返すメソッド
    Vector scalarMultiplication(double scalar){
	    Vector r = new Vector2D();
      double a = scalar * getElement(0);
      double b = scalar * getElement(1);
      r.setElement(0, a);
      r.setElement(1, b);
	    //以下を実装し，rを返す．
	    return r;//
    }

    //abstract double addVector(Vector v)を実装
    //thisと引数vの加算により得られるvectorを返すメソッド
    Vector addVector(Vector v){
      Vector r = new Vector2D();
      double a = v.getElement(0) + getElement(0);
      double b = v.getElement(1) + getElement(1);
      r.setElement(0, a);
      r.setElement(1, b);
    //以下を実装し，rを返す．
      return r;
    }
}