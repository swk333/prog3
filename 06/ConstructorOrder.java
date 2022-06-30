public class ConstructorOrder{ 
  public static void main(String[] args){ 
    System.out.println("クラスAのインスタンスaを生成"); 
    A a = new A(); 
    System.out.println("クラスBのインスタンスbを生成"); 
    B b = new B(); 
    System.out.println("クラスBのインスタンスbbを生成"); 
    B bb = new B("こんにちは"); 
  } 
} 
class A{ 
  A(){ 
    System.out.println("Aのデフォルトコンストラクタ"); 
  } 
} 
class B extends A{ 
  B(){ 
    System.out.println("Bのデフォルトコンストラクタ"); 
  } 
  B(String msg){ 
    System.out.println("コンストラクタB(String)へ渡された引数は\"" + msg + "\"です．"); 
  } 
}
