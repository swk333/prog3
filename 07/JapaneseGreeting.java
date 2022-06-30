abstract class Greeting{ 
  private static String name; 
  public Greeting(){ 
    setName("言語名"); 
  } 
  public Greeting(String name){ 
    setName(name); 
  } 
//ここに，フィールドnameのアクセスメソッドsetName及びgetNameを定義する．行数は適宜増やす．
  protected void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public abstract String morningGreeting(); 
}

public class JapaneseGreeting extends Greeting{
// ここに，実行例のように表示されるよう，JapaneseGreetingのコンストラクタ及び抽象メソッドString morningGreeting()を実装する．行数は適宜増やす
  public JapaneseGreeting(){
    setName("日本語");
  }
  public String morningGreeting(){    
    return "おはようございます";
  }
  public static void main(String[] args){ 
    JapaneseGreeting g = new JapaneseGreeting(); 
    System.out.println(g.getName()); 
    System.out.println(g.morningGreeting()); 
  } 
}
