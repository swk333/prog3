public class ExceptionThrow3{
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
      throw e;
    }
      System.out.println("myAssignから返ります");
  }
}
