import java.io.*;
public class ExceptionSample{
  public static void main(String[] args){
    Integer one = null;
    try{
      System.out.println(one.toString());
    }catch(NullPointerException e){
      System.out.println(e);
    }
  }
}

