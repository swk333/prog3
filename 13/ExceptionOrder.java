import java.io.*;
public class ExceptionOrder{
  public static void main(String[] args){
    try(PrintWriter pw = new PrintWriter(new FileWriter("sample.txt"));){
      pw.println("Hello World");
    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }catch(Exception e){
      System.out.println(e);
    }
    
  }
}
