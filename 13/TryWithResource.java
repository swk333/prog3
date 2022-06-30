// 次のJavaプログラムはtry-catch-ﬁnally文で例外処理を行うプログラムである．同様の処理を行うプログラムをtry-with-resource文で記述しなさい．正しくプログラムが実行され，hello.txtが生成されることを確認したら，エクスプローラ上からhello.txtを右クリックして，ファイルのプロパティを開き，プロパティ下部の属性について読み取り専用にチェックをし，再度プログラムを実行し例外発生の有無を確認しなさい．
import java.io.*;
public class TryWithResource{
  public static void main(String[] args){
    try(PrintWriter pw = new PrintWriter(new FileWriter("hello.txt"));){
      pw.println("Hello World");
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
