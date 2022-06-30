class MyDividerException extends Exception{
  MyDividerException(String message){
    super(message);
  }
}

public class MyDivider{
  public static int divide(int a, int b) throws MyDividerException{
    if(b == 0){
      throw new MyDividerException("0で割ろうとしたので例外が発生しました”");
    } else {
      return a / b;
    }
  }

  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    MyDivider d = new MyDivider();
    try{
      int ans = d.divide(a, b);
      System.out.println(a + " / " + b + " = " + ans);
    }catch(MyDividerException de){
      System.out.println(de);
    }
  }
}