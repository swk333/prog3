// 次のJavaプログラムは，標準入力より数値を文字列として受け取り，数値型に変換し，その数値分の整数値を配列に格納するプログラムの一部である．入力された数値が数値型に変換されない場合にはNumberFormatExceptionが発生されたことを出力し，数値が配列の長さ10以上の値だった場合にはArrayIndexOutOfBoundsExceptionが発生したことを出力し，それ以外の例外が発生した場合には発生した例外を出力するプログラム取るようcatch節を追加しなさい．
// 追加前のプログラム
import java.io.*;
public class Exceptions{
  public static void main(String[] args){
    String aNumber;
    int number;
    int[] anArray = new int[10];//長さ10の配列として初期化
    System.out.print("数字を入力してください: n = ");
    //標準入力を準備
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      aNumber = br.readLine();//標準入力より文字列を受け取る
      number = Integer.parseInt(aNumber);//文字列を数値に変換．
        for (int i = 0;i < number;i++){//anArrayに数値を格納
          anArray[i] = i;
        }
    }catch(NumberFormatException e){
      System.out.println("NumberFormatException" + e);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("ArrayIndexOutOfBoundsException" + e);
    }catch(Exception e){
      System.out.println("Exception" + e);
    }
  }
}