abstract class Greeting{ 
  private static String name; 
  public Greeting(){ 
    setName("言語名"); 
  } 
  public Greeting(String name){ 
    setName(name); 
  } 
  protected void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }

  public abstract String morningGreeting(); 
}

public class EnglishGreeting extends Greeting{

  public EnglishGreeting(){
    setName("英語");
  };
  
  public String morningGreeting(){
    return "Good Morning";
  }
  public static void main(String[] args){ 
    EnglishGreeting g = new EnglishGreeting(); 
    System.out.println(g.getName()); 
    System.out.println(g.morningGreeting()); 
  } 
}
