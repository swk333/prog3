public class PostException1{
  public static void main(String[] args){
    int[] numbers = new int[3];
    try{
      System.out.println("配列を整数値で初期化します．");//(1)
      //0で初期化0
      numbers[0] = Integer.parseInt("0");//(2)
      //1で初期化
      numbers[1] = Integer.parseInt("1");//(3)
      //16進法で表した2で初期化
      numbers[2] = Integer.parseInt("0x2");//(4)
      System.out.println("配列を整数値による初期化を完了しました．");//(5)
    }catch(NumberFormatException e){
      System.out.println("例外は" + e + "です．");//(6)
    }
  }
}
