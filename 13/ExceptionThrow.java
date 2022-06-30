public class ExceptionThrow{
  public static void main(String[] args){
    int[] myarray = new int[3];
    try{
      System.out.println("代入します．");
      myAssign(myarray, 100, 0);
      System.out.println("代入しました．");
    }catch(ArrayIndexOutOfBoundsException ae){
      System.out.println("代入できませんでした．");
      System.out.println("例外は" + ae + "です．");
    }
    System.out.println("終了します．");
  }
  public static void myAssign(int[] array, int index, int value) throws ArrayIndexOutOfBoundsException{
    System.out.println("myAssignに来ました");
    try{
      array[index] = value;
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("myAssign内で例外が発生しました");
      throw new ArrayIndexOutOfBoundsException();
    }
    System.out.println("myAssignから返ります");
  }
}
//myAssignメソッド内で，”myAssignに来ました”と標準出力に出力するように記述．
//try-catch文のtry節内で配列への代入処理を記述．
//配列の代入処理により例外が発生した場合に，catch節内で，”myAssign内で例外が発生しました”と標準出力に出力する．
//さらに，発生した例外をそのままメソッドの呼び出し元に投げる．
//myAssignメソッドが投げる例外については，配列への代入処理で発生しうる例外を調べ，適切なものを用いること．また，mainメソッド内の例外処理については修正しないこと．）
